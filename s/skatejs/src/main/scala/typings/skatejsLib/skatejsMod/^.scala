package typings
package skatejsLib.skatejsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("skatejs", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val props: stdLib.Readonly[skatejsLib.Anon_Any] = js.native
  def define[T /* <: skatejsLib.typesMod.HTMLElementClass */](ctor: T): T = js.native
  def emit(elem: skatejsLib.typesMod.HTMLElementClass, eventName: java.lang.String): scala.Boolean = js.native
  def emit(
    elem: skatejsLib.typesMod.HTMLElementClass,
    eventName: java.lang.String,
    eventOptions: skatejsLib.typesMod.EventOptions
  ): scala.Boolean = js.native
  def emit(elem: stdLib.EventTarget, eventName: java.lang.String): scala.Boolean = js.native
  def emit(
    elem: stdLib.EventTarget,
    eventName: java.lang.String,
    eventOptions: skatejsLib.typesMod.EventOptions
  ): scala.Boolean = js.native
  def link(elem: skatejsLib.typesMod.CustomElement): js.Function1[/* e */ skatejsLib.typesMod.ComposedCustomEvent, scala.Unit] = js.native
  def link(elem: skatejsLib.typesMod.CustomElement, target: java.lang.String): js.Function1[/* e */ skatejsLib.typesMod.ComposedCustomEvent, scala.Unit] = js.native
  def name(): java.lang.String = js.native
  def name(componentName: java.lang.String): java.lang.String = js.native
  def prop(): stdLib.PropertyDecorator with skatejsLib.typesMod.PropOptions[_] = js.native
  def prop(ops: skatejsLib.typesMod.PropOptions[_]): stdLib.PropertyDecorator with skatejsLib.typesMod.PropOptions[_] = js.native
  def shadow(elem: skatejsLib.typesMod.CustomElement): stdLib.ShadowRoot = js.native
  def shadow(elem: stdLib.HTMLElement): stdLib.ShadowRoot = js.native
  def withChildren[T /* <: skatejsLib.typesMod.Constructor[stdLib.HTMLElement] */](): skatejsLib.typesMod.Constructor[skatejsLib.typesMod.WithChildren] with T = js.native
  def withChildren[T /* <: skatejsLib.typesMod.Constructor[stdLib.HTMLElement] */](Base: T): skatejsLib.typesMod.Constructor[skatejsLib.typesMod.WithChildren] with T = js.native
  def withComponent[T /* <: skatejsLib.typesMod.Constructor[stdLib.HTMLElement] */](): skatejsLib.Anon_ObservedAttributes = js.native
  def withComponent[T /* <: skatejsLib.typesMod.Constructor[stdLib.HTMLElement] */](Base: T): skatejsLib.Anon_ObservedAttributes = js.native
  @JSName("withComponent")
  def `withComponent_PSCTConstructor<intersection>`[P, S, C, T /* <: skatejsLib.typesMod.Constructor[stdLib.HTMLElement] */](): (skatejsLib.typesMod.Constructor[skatejsLib.typesMod.WithComponent[P, S, C]]) with T = js.native
  @JSName("withComponent")
  def `withComponent_PSCTConstructor<intersection>`[P, S, C, T /* <: skatejsLib.typesMod.Constructor[stdLib.HTMLElement] */](Base: T): (skatejsLib.typesMod.Constructor[skatejsLib.typesMod.WithComponent[P, S, C]]) with T = js.native
  def withContext[C, T /* <: skatejsLib.typesMod.Constructor[stdLib.HTMLElement] */](): skatejsLib.typesMod.Constructor[skatejsLib.typesMod.WithContext[C]] with T = js.native
  def withContext[C, T /* <: skatejsLib.typesMod.Constructor[stdLib.HTMLElement] */](Base: T): skatejsLib.typesMod.Constructor[skatejsLib.typesMod.WithContext[C]] with T = js.native
  def withLifecycle[T /* <: skatejsLib.typesMod.Constructor[stdLib.HTMLElement] */](): skatejsLib.typesMod.Constructor[skatejsLib.typesMod.WithLifecycle] with T = js.native
  def withLifecycle[T /* <: skatejsLib.typesMod.Constructor[stdLib.HTMLElement] */](Base: T): skatejsLib.typesMod.Constructor[skatejsLib.typesMod.WithLifecycle] with T = js.native
  def withRenderer[O, T /* <: skatejsLib.typesMod.Constructor[stdLib.HTMLElement] */](): skatejsLib.typesMod.Constructor[skatejsLib.typesMod.WithRenderer[O]] with T = js.native
  def withRenderer[O, T /* <: skatejsLib.typesMod.Constructor[stdLib.HTMLElement] */](Base: T): skatejsLib.typesMod.Constructor[skatejsLib.typesMod.WithRenderer[O]] with T = js.native
  def withUpdate[P, S, T /* <: skatejsLib.typesMod.Constructor[stdLib.HTMLElement] */](): (skatejsLib.typesMod.Constructor[skatejsLib.typesMod.WithUpdate[P, S]]) with T = js.native
  def withUpdate[P, S, T /* <: skatejsLib.typesMod.Constructor[stdLib.HTMLElement] */](Base: T): (skatejsLib.typesMod.Constructor[skatejsLib.typesMod.WithUpdate[P, S]]) with T = js.native
}

