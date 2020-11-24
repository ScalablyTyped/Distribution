package typings.spacePen

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Builder extends js.Object {
  
  def buildHtml(): js.Array[_] = js.native
  
  def closeTag(name: String): Unit = js.native
  
  var document: js.Array[_] = js.native
  
  def extractOptions(args: js.Any): js.Any = js.native
  
  def openTag(name: String, attributes: js.Any): Unit = js.native
  
  var postProcessingSteps: js.Array[_] = js.native
  
  def raw(str: String): Unit = js.native
  
  def subview(outletName: js.Any, subview: View): Unit = js.native
  
  def tag(name: String, args: js.Any*): Unit = js.native
  
  def text(str: String): Unit = js.native
}
object Builder {
  
  @scala.inline
  def apply(
    buildHtml: () => js.Array[_],
    closeTag: String => Unit,
    document: js.Array[_],
    extractOptions: js.Any => js.Any,
    openTag: (String, js.Any) => Unit,
    postProcessingSteps: js.Array[_],
    raw: String => Unit,
    subview: (js.Any, View) => Unit,
    tag: (String, /* repeated */ js.Any) => Unit,
    text: String => Unit
  ): Builder = {
    val __obj = js.Dynamic.literal(buildHtml = js.Any.fromFunction0(buildHtml), closeTag = js.Any.fromFunction1(closeTag), document = document.asInstanceOf[js.Any], extractOptions = js.Any.fromFunction1(extractOptions), openTag = js.Any.fromFunction2(openTag), postProcessingSteps = postProcessingSteps.asInstanceOf[js.Any], raw = js.Any.fromFunction1(raw), subview = js.Any.fromFunction2(subview), tag = js.Any.fromFunction2(tag), text = js.Any.fromFunction1(text))
    __obj.asInstanceOf[Builder]
  }
  
  @scala.inline
  implicit class BuilderOps[Self <: Builder] (val x: Self) extends AnyVal {
    
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
    def setBuildHtml(value: () => js.Array[_]): Self = this.set("buildHtml", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCloseTag(value: String => Unit): Self = this.set("closeTag", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDocumentVarargs(value: js.Any*): Self = this.set("document", js.Array(value :_*))
    
    @scala.inline
    def setDocument(value: js.Array[_]): Self = this.set("document", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtractOptions(value: js.Any => js.Any): Self = this.set("extractOptions", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOpenTag(value: (String, js.Any) => Unit): Self = this.set("openTag", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPostProcessingStepsVarargs(value: js.Any*): Self = this.set("postProcessingSteps", js.Array(value :_*))
    
    @scala.inline
    def setPostProcessingSteps(value: js.Array[_]): Self = this.set("postProcessingSteps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRaw(value: String => Unit): Self = this.set("raw", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSubview(value: (js.Any, View) => Unit): Self = this.set("subview", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTag(value: (String, /* repeated */ js.Any) => Unit): Self = this.set("tag", js.Any.fromFunction2(value))
    
    @scala.inline
    def setText(value: String => Unit): Self = this.set("text", js.Any.fromFunction1(value))
  }
}
