package typings.saxStream.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
    * Size of internal transform stream buffer - defaults to 350 objects.
    */
  var highWaterMark: js.UndefOr[Double] = js.native
  
  /**
    * If true, then lowercase tag names and attribute names in loose mode, rather than uppercasing them.
    */
  var lowercase: js.UndefOr[Boolean] = js.native
  
  /**
    * If true, then turn any whitespace into a single space.
    */
  var normalize: js.UndefOr[Boolean] = js.native
  
  /**
    * Default to false, if true makes sax parser to accept valid XML only.
    */
  var strict: js.UndefOr[Boolean] = js.native
  
  /**
    * If true, only parse predefined XML entities (&amp;, &apos;, &gt;, &lt;, and &quot;).
    */
  var strictEntities: js.UndefOr[Boolean] = js.native
  
  /**
    * Name of the tag to select objects from XML file, an Array of tag names can be used -
    * when multiple tags are specified stream pushes `{ tag, record }` tuples.
    */
  var tag: String | js.Array[String] = js.native
  
  /**
    * If false, then don't track line/col/position.
    */
  var trackPosition: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether or not to trim text and comment nodes.
    */
  var trim: js.UndefOr[Boolean] = js.native
  
  /**
    * If true, then namespaces are supported.
    */
  var xmlns: js.UndefOr[Boolean] = js.native
}
object Options {
  
  @scala.inline
  def apply(tag: String | js.Array[String]): Options = {
    val __obj = js.Dynamic.literal(tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setTagVarargs(value: String*): Self = this.set("tag", js.Array(value :_*))
    
    @scala.inline
    def setTag(value: String | js.Array[String]): Self = this.set("tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighWaterMark(value: Double): Self = this.set("highWaterMark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighWaterMark: Self = this.set("highWaterMark", js.undefined)
    
    @scala.inline
    def setLowercase(value: Boolean): Self = this.set("lowercase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLowercase: Self = this.set("lowercase", js.undefined)
    
    @scala.inline
    def setNormalize(value: Boolean): Self = this.set("normalize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNormalize: Self = this.set("normalize", js.undefined)
    
    @scala.inline
    def setStrict(value: Boolean): Self = this.set("strict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrict: Self = this.set("strict", js.undefined)
    
    @scala.inline
    def setStrictEntities(value: Boolean): Self = this.set("strictEntities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrictEntities: Self = this.set("strictEntities", js.undefined)
    
    @scala.inline
    def setTrackPosition(value: Boolean): Self = this.set("trackPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrackPosition: Self = this.set("trackPosition", js.undefined)
    
    @scala.inline
    def setTrim(value: Boolean): Self = this.set("trim", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrim: Self = this.set("trim", js.undefined)
    
    @scala.inline
    def setXmlns(value: Boolean): Self = this.set("xmlns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXmlns: Self = this.set("xmlns", js.undefined)
  }
}
