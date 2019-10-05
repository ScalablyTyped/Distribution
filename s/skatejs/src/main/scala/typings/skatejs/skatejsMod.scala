package typings.skatejs

import typings.skatejs.typesMod.ComposedCustomEvent
import typings.skatejs.typesMod.Constructor
import typings.skatejs.typesMod.EventOptions
import typings.skatejs.typesMod.HTMLElementClass
import typings.skatejs.typesMod.PropOptions
import typings.std.EventTarget
import typings.std.HTMLElement
import typings.std.PropertyDecorator
import typings.std.ShadowRoot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("skatejs", JSImport.Namespace)
@js.native
object skatejsMod extends js.Object {
  @js.native
  class CustomElement ()
    extends typings.skatejs.typesMod.CustomElement
  
  @js.native
  class WithChildren ()
    extends typings.skatejs.typesMod.WithChildren
  
  @js.native
  class WithComponent[P, S, C] ()
    extends typings.skatejs.typesMod.WithComponent[P, S, C]
  
  @js.native
  class WithContext[C] ()
    extends typings.skatejs.typesMod.WithContext[C]
  
  @js.native
  class WithLifecycle ()
    extends typings.skatejs.typesMod.WithLifecycle
  
  @js.native
  class WithRenderer[O] ()
    extends typings.skatejs.typesMod.WithRenderer[O]
  
  @js.native
  class WithUpdate[P, S] ()
    extends typings.skatejs.typesMod.WithUpdate[P, S]
  
  val props: Anon_Any = js.native
  def define[T /* <: HTMLElementClass */](ctor: T): T = js.native
  def emit(elem: HTMLElementClass, eventName: String): Boolean = js.native
  def emit(elem: HTMLElementClass, eventName: String, eventOptions: EventOptions): Boolean = js.native
  def emit(elem: EventTarget, eventName: String): Boolean = js.native
  def emit(elem: EventTarget, eventName: String, eventOptions: EventOptions): Boolean = js.native
  def link(elem: typings.skatejs.typesMod.CustomElement): js.Function1[/* e */ ComposedCustomEvent, Unit] = js.native
  def link(elem: typings.skatejs.typesMod.CustomElement, target: String): js.Function1[/* e */ ComposedCustomEvent, Unit] = js.native
  def name(): String = js.native
  def name(componentName: String): String = js.native
  def prop(): PropertyDecorator with PropOptions[_] = js.native
  def prop(ops: PropOptions[_]): PropertyDecorator with PropOptions[_] = js.native
  def shadow(elem: typings.skatejs.typesMod.CustomElement): ShadowRoot = js.native
  def shadow(elem: HTMLElement): ShadowRoot = js.native
  def withChildren[T /* <: Constructor[HTMLElement] */](): Constructor[typings.skatejs.typesMod.WithChildren] with T = js.native
  def withChildren[T /* <: Constructor[HTMLElement] */](Base: T): Constructor[typings.skatejs.typesMod.WithChildren] with T = js.native
  def withComponent[T /* <: Constructor[HTMLElement] */](): TypeofClassWithComponent = js.native
  def withComponent[T /* <: Constructor[HTMLElement] */](Base: T): TypeofClassWithComponent = js.native
  @JSName("withComponent")
  def withComponent_PSCT_ConstructorHTMLElement_Intersection[P, S, C, T /* <: Constructor[HTMLElement] */](): (Constructor[typings.skatejs.typesMod.WithComponent[P, S, C]]) with T = js.native
  @JSName("withComponent")
  def withComponent_PSCT_ConstructorHTMLElement_Intersection[P, S, C, T /* <: Constructor[HTMLElement] */](Base: T): (Constructor[typings.skatejs.typesMod.WithComponent[P, S, C]]) with T = js.native
  def withContext[C, T /* <: Constructor[HTMLElement] */](): Constructor[typings.skatejs.typesMod.WithContext[C]] with T = js.native
  def withContext[C, T /* <: Constructor[HTMLElement] */](Base: T): Constructor[typings.skatejs.typesMod.WithContext[C]] with T = js.native
  def withLifecycle[T /* <: Constructor[HTMLElement] */](): Constructor[typings.skatejs.typesMod.WithLifecycle] with T = js.native
  def withLifecycle[T /* <: Constructor[HTMLElement] */](Base: T): Constructor[typings.skatejs.typesMod.WithLifecycle] with T = js.native
  def withRenderer[O, T /* <: Constructor[HTMLElement] */](): Constructor[typings.skatejs.typesMod.WithRenderer[O]] with T = js.native
  def withRenderer[O, T /* <: Constructor[HTMLElement] */](Base: T): Constructor[typings.skatejs.typesMod.WithRenderer[O]] with T = js.native
  def withUpdate[P, S, T /* <: Constructor[HTMLElement] */](): (Constructor[typings.skatejs.typesMod.WithUpdate[P, S]]) with T = js.native
  def withUpdate[P, S, T /* <: Constructor[HTMLElement] */](Base: T): (Constructor[typings.skatejs.typesMod.WithUpdate[P, S]]) with T = js.native
  /* static members */
  @js.native
  object CustomElement extends js.Object {
    val observedAttributes: js.Array[String] = js.native
  }
  
  /* static members */
  @js.native
  object WithComponent extends js.Object {
    val observedAttributes: js.Array[String] = js.native
  }
  
}

