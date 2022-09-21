package typings.segmentApi

import org.scalablytyped.runtime.StringDictionary
import typings.std.HTMLElement
import typings.std.HTMLFormElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("segment-api", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def alias(userId: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("alias")(userId.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def alias(userId: String, previousId: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("alias")(userId.asInstanceOf[js.Any], previousId.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def alias(userId: String, previousId: String, options: Unit, callback: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("alias")(userId.asInstanceOf[js.Any], previousId.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def alias(userId: String, previousId: String, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("alias")(userId.asInstanceOf[js.Any], previousId.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def alias(userId: String, previousId: String, options: Options, callback: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("alias")(userId.asInstanceOf[js.Any], previousId.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def alias(userId: String, previousId: Unit, options: Unit, callback: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("alias")(userId.asInstanceOf[js.Any], previousId.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def alias(userId: String, previousId: Unit, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("alias")(userId.asInstanceOf[js.Any], previousId.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def alias(userId: String, previousId: Unit, options: Options, callback: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("alias")(userId.asInstanceOf[js.Any], previousId.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def debug(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("debug")().asInstanceOf[Unit]
  inline def debug(enable: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("debug")(enable.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def group(groupId: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("group")(groupId.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def group(groupId: String, traits: Unit, options: Unit, callback: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("group")(groupId.asInstanceOf[js.Any], traits.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def group(groupId: String, traits: Unit, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("group")(groupId.asInstanceOf[js.Any], traits.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def group(groupId: String, traits: Unit, options: Options, callback: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("group")(groupId.asInstanceOf[js.Any], traits.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def group(groupId: String, traits: Traits): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("group")(groupId.asInstanceOf[js.Any], traits.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def group(groupId: String, traits: Traits, options: Unit, callback: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("group")(groupId.asInstanceOf[js.Any], traits.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def group(groupId: String, traits: Traits, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("group")(groupId.asInstanceOf[js.Any], traits.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def group(groupId: String, traits: Traits, options: Options, callback: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("group")(groupId.asInstanceOf[js.Any], traits.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def identify(userId: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("identify")(userId.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def identify(userId: String, traits: Unit, options: Unit, callback: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("identify")(userId.asInstanceOf[js.Any], traits.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def identify(userId: String, traits: Unit, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("identify")(userId.asInstanceOf[js.Any], traits.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def identify(userId: String, traits: Unit, options: Options, callback: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("identify")(userId.asInstanceOf[js.Any], traits.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def identify(userId: String, traits: Traits): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("identify")(userId.asInstanceOf[js.Any], traits.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def identify(userId: String, traits: Traits, options: Unit, callback: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("identify")(userId.asInstanceOf[js.Any], traits.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def identify(userId: String, traits: Traits, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("identify")(userId.asInstanceOf[js.Any], traits.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def identify(userId: String, traits: Traits, options: Options, callback: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("identify")(userId.asInstanceOf[js.Any], traits.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def init(key: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(key.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def on(method: String, callback: EventFiredCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(method.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def page(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("page")().asInstanceOf[Unit]
  inline def page(category: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("page")(category.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def page(category: String, name: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("page")(category.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def page(category: String, name: String, properties: Unit, options: Unit, callback: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("page")(category.asInstanceOf[js.Any], name.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def page(category: String, name: String, properties: Unit, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("page")(category.asInstanceOf[js.Any], name.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def page(category: String, name: String, properties: Unit, options: Options, callback: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("page")(category.asInstanceOf[js.Any], name.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def page(category: String, name: String, properties: Properties): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("page")(category.asInstanceOf[js.Any], name.asInstanceOf[js.Any], properties.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def page(category: String, name: String, properties: Properties, options: Unit, callback: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("page")(category.asInstanceOf[js.Any], name.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def page(category: String, name: String, properties: Properties, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("page")(category.asInstanceOf[js.Any], name.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def page(category: String, name: String, properties: Properties, options: Options, callback: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("page")(category.asInstanceOf[js.Any], name.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def page(category: String, name: Unit, properties: Unit, options: Unit, callback: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("page")(category.asInstanceOf[js.Any], name.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def page(category: String, name: Unit, properties: Unit, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("page")(category.asInstanceOf[js.Any], name.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def page(category: String, name: Unit, properties: Unit, options: Options, callback: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("page")(category.asInstanceOf[js.Any], name.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def page(category: String, name: Unit, properties: Properties): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("page")(category.asInstanceOf[js.Any], name.asInstanceOf[js.Any], properties.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def page(category: String, name: Unit, properties: Properties, options: Unit, callback: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("page")(category.asInstanceOf[js.Any], name.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def page(category: String, name: Unit, properties: Properties, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("page")(category.asInstanceOf[js.Any], name.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def page(category: String, name: Unit, properties: Properties, options: Options, callback: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("page")(category.asInstanceOf[js.Any], name.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def page(category: Unit, name: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("page")(category.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def page(category: Unit, name: String, properties: Unit, options: Unit, callback: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("page")(category.asInstanceOf[js.Any], name.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def page(category: Unit, name: String, properties: Unit, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("page")(category.asInstanceOf[js.Any], name.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def page(category: Unit, name: String, properties: Unit, options: Options, callback: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("page")(category.asInstanceOf[js.Any], name.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def page(category: Unit, name: String, properties: Properties): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("page")(category.asInstanceOf[js.Any], name.asInstanceOf[js.Any], properties.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def page(category: Unit, name: String, properties: Properties, options: Unit, callback: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("page")(category.asInstanceOf[js.Any], name.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def page(category: Unit, name: String, properties: Properties, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("page")(category.asInstanceOf[js.Any], name.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def page(category: Unit, name: String, properties: Properties, options: Options, callback: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("page")(category.asInstanceOf[js.Any], name.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def page(category: Unit, name: Unit, properties: Unit, options: Unit, callback: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("page")(category.asInstanceOf[js.Any], name.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def page(category: Unit, name: Unit, properties: Unit, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("page")(category.asInstanceOf[js.Any], name.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def page(category: Unit, name: Unit, properties: Unit, options: Options, callback: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("page")(category.asInstanceOf[js.Any], name.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def page(category: Unit, name: Unit, properties: Properties): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("page")(category.asInstanceOf[js.Any], name.asInstanceOf[js.Any], properties.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def page(category: Unit, name: Unit, properties: Properties, options: Unit, callback: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("page")(category.asInstanceOf[js.Any], name.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def page(category: Unit, name: Unit, properties: Properties, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("page")(category.asInstanceOf[js.Any], name.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def page(category: Unit, name: Unit, properties: Properties, options: Options, callback: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("page")(category.asInstanceOf[js.Any], name.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def ready(callback: ReadyCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ready")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def reset(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reset")().asInstanceOf[Unit]
  
  inline def timeout(ms: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("timeout")(ms.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def track(event: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("track")(event.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def track(event: String, properties: Unit, options: Unit, callback: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("track")(event.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def track(event: String, properties: Unit, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("track")(event.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def track(event: String, properties: Unit, options: Options, callback: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("track")(event.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def track(event: String, properties: Properties): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("track")(event.asInstanceOf[js.Any], properties.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def track(event: String, properties: Properties, options: Unit, callback: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("track")(event.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def track(event: String, properties: Properties, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("track")(event.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def track(event: String, properties: Properties, options: Options, callback: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("track")(event.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def trackForm(form: js.Array[HTMLElement], event: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trackForm")(form.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def trackForm(form: js.Array[HTMLElement], event: String, properties: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trackForm")(form.asInstanceOf[js.Any], event.asInstanceOf[js.Any], properties.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def trackForm(form: js.Array[HTMLElement], event: String, properties: Properties): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trackForm")(form.asInstanceOf[js.Any], event.asInstanceOf[js.Any], properties.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def trackForm(form: js.Array[HTMLElement], event: EventCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trackForm")(form.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def trackForm(form: js.Array[HTMLElement], event: EventCallback, properties: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trackForm")(form.asInstanceOf[js.Any], event.asInstanceOf[js.Any], properties.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def trackForm(form: js.Array[HTMLElement], event: EventCallback, properties: Properties): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trackForm")(form.asInstanceOf[js.Any], event.asInstanceOf[js.Any], properties.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def trackForm(form: HTMLFormElement, event: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trackForm")(form.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def trackForm(form: HTMLFormElement, event: String, properties: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trackForm")(form.asInstanceOf[js.Any], event.asInstanceOf[js.Any], properties.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def trackForm(form: HTMLFormElement, event: String, properties: Properties): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trackForm")(form.asInstanceOf[js.Any], event.asInstanceOf[js.Any], properties.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def trackForm(form: HTMLFormElement, event: EventCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trackForm")(form.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def trackForm(form: HTMLFormElement, event: EventCallback, properties: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trackForm")(form.asInstanceOf[js.Any], event.asInstanceOf[js.Any], properties.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def trackForm(form: HTMLFormElement, event: EventCallback, properties: Properties): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trackForm")(form.asInstanceOf[js.Any], event.asInstanceOf[js.Any], properties.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def trackLink(element: js.Array[HTMLElement], event: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trackLink")(element.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def trackLink(element: js.Array[HTMLElement], event: String, properties: Properties): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trackLink")(element.asInstanceOf[js.Any], event.asInstanceOf[js.Any], properties.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def trackLink(element: js.Array[HTMLElement], event: String, properties: PropertiesCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trackLink")(element.asInstanceOf[js.Any], event.asInstanceOf[js.Any], properties.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def trackLink(element: js.Array[HTMLElement], event: EventCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trackLink")(element.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def trackLink(element: js.Array[HTMLElement], event: EventCallback, properties: Properties): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trackLink")(element.asInstanceOf[js.Any], event.asInstanceOf[js.Any], properties.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def trackLink(element: js.Array[HTMLElement], event: EventCallback, properties: PropertiesCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trackLink")(element.asInstanceOf[js.Any], event.asInstanceOf[js.Any], properties.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def trackLink(element: HTMLElement, event: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trackLink")(element.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def trackLink(element: HTMLElement, event: String, properties: Properties): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trackLink")(element.asInstanceOf[js.Any], event.asInstanceOf[js.Any], properties.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def trackLink(element: HTMLElement, event: String, properties: PropertiesCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trackLink")(element.asInstanceOf[js.Any], event.asInstanceOf[js.Any], properties.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def trackLink(element: HTMLElement, event: EventCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trackLink")(element.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def trackLink(element: HTMLElement, event: EventCallback, properties: Properties): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trackLink")(element.asInstanceOf[js.Any], event.asInstanceOf[js.Any], properties.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def trackLink(element: HTMLElement, event: EventCallback, properties: PropertiesCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trackLink")(element.asInstanceOf[js.Any], event.asInstanceOf[js.Any], properties.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait Address extends StObject {
    
    var city: js.UndefOr[String] = js.undefined
    
    var country: js.UndefOr[String] = js.undefined
    
    var postalCode: js.UndefOr[String] = js.undefined
    
    var state: js.UndefOr[String] = js.undefined
    
    var street: js.UndefOr[String] = js.undefined
  }
  object Address {
    
    inline def apply(): Address = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Address]
    }
    
    extension [Self <: Address](x: Self) {
      
      inline def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
      
      inline def setCityUndefined: Self = StObject.set(x, "city", js.undefined)
      
      inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
      
      inline def setPostalCode(value: String): Self = StObject.set(x, "postalCode", value.asInstanceOf[js.Any])
      
      inline def setPostalCodeUndefined: Self = StObject.set(x, "postalCode", js.undefined)
      
      inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      inline def setStreet(value: String): Self = StObject.set(x, "street", value.asInstanceOf[js.Any])
      
      inline def setStreetUndefined: Self = StObject.set(x, "street", js.undefined)
    }
  }
  
  type Callback = js.Function1[/* err */ String, Unit]
  
  trait Company extends StObject {
    
    var employee_count: js.UndefOr[Double] = js.undefined
    
    var id: js.UndefOr[String | Double] = js.undefined
    
    var industry: js.UndefOr[String] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var plan: js.UndefOr[String] = js.undefined
  }
  object Company {
    
    inline def apply(): Company = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Company]
    }
    
    extension [Self <: Company](x: Self) {
      
      inline def setEmployee_count(value: Double): Self = StObject.set(x, "employee_count", value.asInstanceOf[js.Any])
      
      inline def setEmployee_countUndefined: Self = StObject.set(x, "employee_count", js.undefined)
      
      inline def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setIndustry(value: String): Self = StObject.set(x, "industry", value.asInstanceOf[js.Any])
      
      inline def setIndustryUndefined: Self = StObject.set(x, "industry", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPlan(value: String): Self = StObject.set(x, "plan", value.asInstanceOf[js.Any])
      
      inline def setPlanUndefined: Self = StObject.set(x, "plan", js.undefined)
    }
  }
  
  type EventCallback = js.Function0[String]
  
  type EventFiredCallback = js.Function3[/* event */ String, /* properties */ Properties, /* options */ Options, Unit]
  
  type ISO8601Date = String
  
  type Options = StringDictionary[Any]
  
  type Properties = StringDictionary[Any]
  
  type PropertiesCallback = js.Function0[Properties]
  
  type ReadyCallback = js.Function0[Unit]
  
  trait Traits extends StObject {
    
    var address: js.UndefOr[Address] = js.undefined
    
    var age: js.UndefOr[Double] = js.undefined
    
    var avatar: js.UndefOr[String] = js.undefined
    
    var birthday: js.UndefOr[ISO8601Date] = js.undefined
    
    var company: js.UndefOr[Company] = js.undefined
    
    var createdAt: js.UndefOr[ISO8601Date] = js.undefined
    
    var description: js.UndefOr[String] = js.undefined
    
    var email: js.UndefOr[String] = js.undefined
    
    var firstName: js.UndefOr[String] = js.undefined
    
    var gender: js.UndefOr[String] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var lastName: js.UndefOr[String] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var username: js.UndefOr[String] = js.undefined
    
    var website: js.UndefOr[String] = js.undefined
  }
  object Traits {
    
    inline def apply(): Traits = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Traits]
    }
    
    extension [Self <: Traits](x: Self) {
      
      inline def setAddress(value: Address): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
      
      inline def setAge(value: Double): Self = StObject.set(x, "age", value.asInstanceOf[js.Any])
      
      inline def setAgeUndefined: Self = StObject.set(x, "age", js.undefined)
      
      inline def setAvatar(value: String): Self = StObject.set(x, "avatar", value.asInstanceOf[js.Any])
      
      inline def setAvatarUndefined: Self = StObject.set(x, "avatar", js.undefined)
      
      inline def setBirthday(value: ISO8601Date): Self = StObject.set(x, "birthday", value.asInstanceOf[js.Any])
      
      inline def setBirthdayUndefined: Self = StObject.set(x, "birthday", js.undefined)
      
      inline def setCompany(value: Company): Self = StObject.set(x, "company", value.asInstanceOf[js.Any])
      
      inline def setCompanyUndefined: Self = StObject.set(x, "company", js.undefined)
      
      inline def setCreatedAt(value: ISO8601Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
      
      inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setFirstName(value: String): Self = StObject.set(x, "firstName", value.asInstanceOf[js.Any])
      
      inline def setFirstNameUndefined: Self = StObject.set(x, "firstName", js.undefined)
      
      inline def setGender(value: String): Self = StObject.set(x, "gender", value.asInstanceOf[js.Any])
      
      inline def setGenderUndefined: Self = StObject.set(x, "gender", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setLastName(value: String): Self = StObject.set(x, "lastName", value.asInstanceOf[js.Any])
      
      inline def setLastNameUndefined: Self = StObject.set(x, "lastName", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
      
      inline def setWebsite(value: String): Self = StObject.set(x, "website", value.asInstanceOf[js.Any])
      
      inline def setWebsiteUndefined: Self = StObject.set(x, "website", js.undefined)
    }
  }
}
