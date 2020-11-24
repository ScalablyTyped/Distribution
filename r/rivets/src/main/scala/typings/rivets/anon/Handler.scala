package typings.rivets.anon

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Handler extends js.Object {
  
  // Augment the event handler of the on-* binder
  var handler: js.UndefOr[js.Function3[/* context */ js.Any, /* ev */ Event, /* biding */ js.Any, Unit]] = js.native
  
  // Attribute prefix in templates
  var prefix: js.UndefOr[String] = js.native
  
  // Preload templates with initial data on bind
  var preloadData: js.UndefOr[Boolean] = js.native
  
  // Root sightglass interface for keypaths
  var rootInterface: js.UndefOr[String] = js.native
  
  // Template delimiters for text bindings
  var templateDelimiters: js.UndefOr[js.Array[String]] = js.native
}
object Handler {
  
  @scala.inline
  def apply(): Handler = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Handler]
  }
  
  @scala.inline
  implicit class HandlerOps[Self <: Handler] (val x: Self) extends AnyVal {
    
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
    def setHandler(value: (/* context */ js.Any, /* ev */ Event, /* biding */ js.Any) => Unit): Self = this.set("handler", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteHandler: Self = this.set("handler", js.undefined)
    
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    
    @scala.inline
    def setPreloadData(value: Boolean): Self = this.set("preloadData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreloadData: Self = this.set("preloadData", js.undefined)
    
    @scala.inline
    def setRootInterface(value: String): Self = this.set("rootInterface", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRootInterface: Self = this.set("rootInterface", js.undefined)
    
    @scala.inline
    def setTemplateDelimitersVarargs(value: String*): Self = this.set("templateDelimiters", js.Array(value :_*))
    
    @scala.inline
    def setTemplateDelimiters(value: js.Array[String]): Self = this.set("templateDelimiters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplateDelimiters: Self = this.set("templateDelimiters", js.undefined)
  }
}
