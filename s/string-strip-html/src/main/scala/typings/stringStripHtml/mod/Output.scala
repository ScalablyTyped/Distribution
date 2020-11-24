package typings.stringStripHtml.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Output extends js.Object {
  
  /**
    * Array of zero or more arrays
    *
    * For example, [[0, 5], [30, 35]]. If you String.slice() each pair, you'll get HTML tag values.
    */
  var allTagLocations: js.Array[js.Tuple2[Double, Double]] = js.native
  
  /**
    * Array of zero or more arrays
    *
    * Only the tags that ended up stripped will be reported here.
    * Takes into account opts.ignoreTags and opts.onlyStripTags, unlike allTagLocations above. For example, [[0, 5], [30, 35]].
    */
  var filteredTagLocations: js.Array[js.Tuple2[Double, Double]] = js.native
  
  /**
    * Plain object
    *
    * For example, { timeTakenInMilliseconds: 6 }
    */
  var log: Log = js.native
  
  /**
    * Array of one or more string range arrays OR null
    *
    * For example, if characters from index 0 to 5 and 30 to 35 were deleted, that would be [[0, 5], [30, 35]]
    */
  var ranges: (js.Array[js.Tuple3[Double, Double, js.UndefOr[String]]]) | Null = js.native
  
  /** The string version where all ranges were applied to it. */
  var result: String = js.native
}
object Output {
  
  @scala.inline
  def apply(
    allTagLocations: js.Array[js.Tuple2[Double, Double]],
    filteredTagLocations: js.Array[js.Tuple2[Double, Double]],
    log: Log,
    result: String
  ): Output = {
    val __obj = js.Dynamic.literal(allTagLocations = allTagLocations.asInstanceOf[js.Any], filteredTagLocations = filteredTagLocations.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[Output]
  }
  
  @scala.inline
  implicit class OutputOps[Self <: Output] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAllTagLocationsVarargs(value: (js.Tuple2[Double, Double])*): Self = this.set("allTagLocations", js.Array(value :_*))
    
    @scala.inline
    def setAllTagLocations(value: js.Array[js.Tuple2[Double, Double]]): Self = this.set("allTagLocations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilteredTagLocationsVarargs(value: (js.Tuple2[Double, Double])*): Self = this.set("filteredTagLocations", js.Array(value :_*))
    
    @scala.inline
    def setFilteredTagLocations(value: js.Array[js.Tuple2[Double, Double]]): Self = this.set("filteredTagLocations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLog(value: Log): Self = this.set("log", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResult(value: String): Self = this.set("result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangesVarargs(value: (js.Tuple3[Double, Double, js.UndefOr[String]])*): Self = this.set("ranges", js.Array(value :_*))
    
    @scala.inline
    def setRanges(value: js.Array[js.Tuple3[Double, Double, js.UndefOr[String]]]): Self = this.set("ranges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangesNull: Self = this.set("ranges", null)
  }
}
