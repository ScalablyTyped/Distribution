package typings.reactSpringWeb

import typings.reactSpringTypes.utilMod.Lookup
import typings.reactSpringWeb.reactSpringWebBooleans.`false`
import typings.std.AddEventListenerOptions
import typings.std.EventListenerOptions
import typings.std.EventListenerOrEventListenerObject
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcApplyAnimatedValuesMod {
  
  @JSImport("@react-spring/web/dist/declarations/src/applyAnimatedValues", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def applyAnimatedValues(instance: Instance, props: Lookup[Any]): js.UndefOr[`false`] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyAnimatedValues")(instance.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[`false`]]
  
  @js.native
  trait Instance
    extends StObject
       with HTMLDivElement {
    
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
    
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
    
    @JSName("style")
    var style_Instance: js.UndefOr[Lookup[Any]] = js.native
  }
}
