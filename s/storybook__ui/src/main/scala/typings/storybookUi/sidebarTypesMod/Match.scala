package typings.storybookUi.sidebarTypesMod

import typings.storybookUi.storybookUiStrings.name
import typings.storybookUi.storybookUiStrings.path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Match extends js.Object {
  
  var arrayIndex: Double = js.native
  
  var indices: js.Array[js.Tuple2[Double, Double]] = js.native
  
  var key: name | path = js.native
  
  var value: String = js.native
}
object Match {
  
  @scala.inline
  def apply(arrayIndex: Double, indices: js.Array[js.Tuple2[Double, Double]], key: name | path, value: String): Match = {
    val __obj = js.Dynamic.literal(arrayIndex = arrayIndex.asInstanceOf[js.Any], indices = indices.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Match]
  }
  
  @scala.inline
  implicit class MatchOps[Self <: Match] (val x: Self) extends AnyVal {
    
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
    def setArrayIndex(value: Double): Self = this.set("arrayIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndicesVarargs(value: (js.Tuple2[Double, Double])*): Self = this.set("indices", js.Array(value :_*))
    
    @scala.inline
    def setIndices(value: js.Array[js.Tuple2[Double, Double]]): Self = this.set("indices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: name | path): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
