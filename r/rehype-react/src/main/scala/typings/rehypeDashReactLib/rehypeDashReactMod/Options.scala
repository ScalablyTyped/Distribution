package typings
package rehypeDashReactLib.rehypeDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var components: org.scalablytyped.runtime.StringDictionary[reactLib.reactMod.ComponentType[_]] = js.native
  @JSName("createElement")
  var createElement_Original: rehypeDashReactLib.Anon_A = js.native
  var prefix: js.UndefOr[java.lang.String] = js.native
  def createElement[P /* <: js.Object */](`type`: java.lang.String): reactLib.reactMod.ReactElement[P] = js.native
  def createElement[P /* <: js.Object */](
    `type`: java.lang.String,
    props: reactLib.reactMod.Attributes with (P | scala.Null),
    children: reactLib.reactMod.ReactNode*
  ): reactLib.reactMod.ReactElement[P] = js.native
  def createElement[P /* <: js.Object */](
    `type`: reactLib.reactMod.ClassType[
      P, 
      reactLib.reactMod.ClassicComponent[P, reactLib.reactMod.ComponentState], 
      reactLib.reactMod.ClassicComponentClass[P]
    ]
  ): reactLib.reactMod.CElement[P, reactLib.reactMod.ClassicComponent[P, reactLib.reactMod.ComponentState]] = js.native
  def createElement[P /* <: js.Object */](
    `type`: reactLib.reactMod.ClassType[
      P, 
      reactLib.reactMod.ClassicComponent[P, reactLib.reactMod.ComponentState], 
      reactLib.reactMod.ClassicComponentClass[P]
    ],
    props: (reactLib.reactMod.ClassAttributes[reactLib.reactMod.ClassicComponent[P, reactLib.reactMod.ComponentState]]) with (P | scala.Null),
    children: reactLib.reactMod.ReactNode*
  ): reactLib.reactMod.CElement[P, reactLib.reactMod.ClassicComponent[P, reactLib.reactMod.ComponentState]] = js.native
  def createElement[P /* <: js.Object */](`type`: reactLib.reactMod.ComponentClass[P, reactLib.reactMod.ComponentState]): reactLib.reactMod.ReactElement[P] = js.native
  def createElement[P /* <: js.Object */](
    `type`: reactLib.reactMod.ComponentClass[P, reactLib.reactMod.ComponentState],
    props: reactLib.reactMod.Attributes with (P | scala.Null),
    children: reactLib.reactMod.ReactNode*
  ): reactLib.reactMod.ReactElement[P] = js.native
  def createElement[P /* <: js.Object */](`type`: reactLib.reactMod.FunctionComponent[P]): reactLib.reactMod.ReactElement[P] = js.native
  def createElement[P /* <: js.Object */](
    `type`: reactLib.reactMod.FunctionComponent[P],
    props: reactLib.reactMod.Attributes with (P | scala.Null),
    children: reactLib.reactMod.ReactNode*
  ): reactLib.reactMod.ReactElement[P] = js.native
  def createElement[P /* <: reactLib.reactMod.DOMAttributes[T] */, T /* <: reactLib.Element */](
    `type`: java.lang.String,
    props: reactLib.reactMod.ClassAttributes[T] with (P | scala.Null),
    children: reactLib.reactMod.ReactNode*
  ): reactLib.reactMod.DOMElement[P, T] = js.native
  def createElement[P /* <: reactLib.reactMod.HTMLAttributes[T] */, T /* <: reactLib.HTMLElement */](`type`: /* import warning: LimitUnionLength.enterTypeRef Was union type with length 114 */ js.Any): reactLib.reactMod.DetailedReactHTMLElement[P, T] = js.native
  def createElement[P /* <: reactLib.reactMod.HTMLAttributes[T] */, T /* <: reactLib.HTMLElement */](
    `type`: /* import warning: LimitUnionLength.enterTypeRef Was union type with length 114 */ js.Any,
    props: reactLib.reactMod.ClassAttributes[T] with (P | scala.Null),
    children: reactLib.reactMod.ReactNode*
  ): reactLib.reactMod.DetailedReactHTMLElement[P, T] = js.native
  @JSName("createElement")
  def createElement_PDOMAttributesTElementDOMElement[P /* <: reactLib.reactMod.DOMAttributes[T] */, T /* <: reactLib.Element */](`type`: java.lang.String): reactLib.reactMod.DOMElement[P, T] = js.native
  @JSName("createElement")
  def createElement_PObjectFunctionComponentElement[P /* <: js.Object */](`type`: reactLib.reactMod.FunctionComponent[P]): reactLib.reactMod.FunctionComponentElement[P] = js.native
  @JSName("createElement")
  def createElement_PObjectFunctionComponentElement[P /* <: js.Object */](
    `type`: reactLib.reactMod.FunctionComponent[P],
    props: reactLib.reactMod.Attributes with (P | scala.Null),
    children: reactLib.reactMod.ReactNode*
  ): reactLib.reactMod.FunctionComponentElement[P] = js.native
  @JSName("createElement")
  def createElement_PObjectTComponentCComponentClass[P /* <: js.Object */, T /* <: reactLib.reactMod.Component[P, reactLib.reactMod.ComponentState, _] */, C /* <: reactLib.reactMod.ComponentClass[P, reactLib.reactMod.ComponentState] */](`type`: reactLib.reactMod.ClassType[P, T, C]): reactLib.reactMod.CElement[P, T] = js.native
  @JSName("createElement")
  def createElement_PObjectTComponentCComponentClass[P /* <: js.Object */, T /* <: reactLib.reactMod.Component[P, reactLib.reactMod.ComponentState, _] */, C /* <: reactLib.reactMod.ComponentClass[P, reactLib.reactMod.ComponentState] */](
    `type`: reactLib.reactMod.ClassType[P, T, C],
    props: reactLib.reactMod.ClassAttributes[T] with (P | scala.Null),
    children: reactLib.reactMod.ReactNode*
  ): reactLib.reactMod.CElement[P, T] = js.native
  @JSName("createElement")
  def createElement_PSVGAttributesTSVGElementReactSVGElement[P /* <: reactLib.reactMod.SVGAttributes[T] */, T /* <: reactLib.SVGElement */](`type`: /* import warning: LimitUnionLength.enterTypeRef Was union type with length 55 */ js.Any): reactLib.reactMod.ReactSVGElement = js.native
  @JSName("createElement")
  def createElement_PSVGAttributesTSVGElementReactSVGElement[P /* <: reactLib.reactMod.SVGAttributes[T] */, T /* <: reactLib.SVGElement */](
    `type`: /* import warning: LimitUnionLength.enterTypeRef Was union type with length 55 */ js.Any,
    props: reactLib.reactMod.ClassAttributes[T] with (P | scala.Null),
    children: reactLib.reactMod.ReactNode*
  ): reactLib.reactMod.ReactSVGElement = js.native
  @JSName("createElement")
  def createElement_input(`type`: rehypeDashReactLib.rehypeDashReactLibStrings.input): reactLib.reactMod.DetailedReactHTMLElement[
    reactLib.reactMod.InputHTMLAttributes[reactLib.HTMLInputElement], 
    reactLib.HTMLInputElement
  ] = js.native
  @JSName("createElement")
  def createElement_input(
    `type`: rehypeDashReactLib.rehypeDashReactLibStrings.input,
    props: reactLib.reactMod.InputHTMLAttributes[reactLib.HTMLInputElement] with (reactLib.reactMod.ClassAttributes[reactLib.HTMLInputElement] | scala.Null),
    children: reactLib.reactMod.ReactNode*
  ): reactLib.reactMod.DetailedReactHTMLElement[
    reactLib.reactMod.InputHTMLAttributes[reactLib.HTMLInputElement], 
    reactLib.HTMLInputElement
  ] = js.native
}

