package typings
package rehypeDashReactLib.rehypeDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var components: org.scalablytyped.runtime.StringDictionary[reactLib.reactMod.ReactNs.ComponentType[_]] = js.native
  @JSName("createElement")
  var createElement_Original: rehypeDashReactLib.Anon_A = js.native
  var prefix: js.UndefOr[java.lang.String] = js.native
  def createElement[P /* <: js.Object */](`type`: java.lang.String): reactLib.reactMod.ReactNs.ReactElement[P] = js.native
  def createElement[P /* <: js.Object */](
    `type`: java.lang.String,
    props: reactLib.reactMod.ReactNs.Attributes with (P | scala.Null),
    children: reactLib.reactMod.ReactNs.ReactNode*
  ): reactLib.reactMod.ReactNs.ReactElement[P] = js.native
  def createElement[P /* <: js.Object */](
    `type`: reactLib.reactMod.ReactNs.ClassType[
      P, 
      reactLib.reactMod.ReactNs.ClassicComponent[P, reactLib.reactMod.ReactNs.ComponentState], 
      reactLib.reactMod.ReactNs.ClassicComponentClass[P]
    ]
  ): reactLib.reactMod.ReactNs.CElement[
    P, 
    reactLib.reactMod.ReactNs.ClassicComponent[P, reactLib.reactMod.ReactNs.ComponentState]
  ] = js.native
  def createElement[P /* <: js.Object */](
    `type`: reactLib.reactMod.ReactNs.ClassType[
      P, 
      reactLib.reactMod.ReactNs.ClassicComponent[P, reactLib.reactMod.ReactNs.ComponentState], 
      reactLib.reactMod.ReactNs.ClassicComponentClass[P]
    ],
    props: (reactLib.reactMod.ReactNs.ClassAttributes[
      reactLib.reactMod.ReactNs.ClassicComponent[P, reactLib.reactMod.ReactNs.ComponentState]
    ]) with (P | scala.Null),
    children: reactLib.reactMod.ReactNs.ReactNode*
  ): reactLib.reactMod.ReactNs.CElement[
    P, 
    reactLib.reactMod.ReactNs.ClassicComponent[P, reactLib.reactMod.ReactNs.ComponentState]
  ] = js.native
  def createElement[P /* <: js.Object */](`type`: reactLib.reactMod.ReactNs.ComponentClass[P, reactLib.reactMod.ReactNs.ComponentState]): reactLib.reactMod.ReactNs.ReactElement[P] = js.native
  def createElement[P /* <: js.Object */](
    `type`: reactLib.reactMod.ReactNs.ComponentClass[P, reactLib.reactMod.ReactNs.ComponentState],
    props: reactLib.reactMod.ReactNs.Attributes with (P | scala.Null),
    children: reactLib.reactMod.ReactNs.ReactNode*
  ): reactLib.reactMod.ReactNs.ReactElement[P] = js.native
  def createElement[P /* <: js.Object */](`type`: reactLib.reactMod.ReactNs.FunctionComponent[P]): reactLib.reactMod.ReactNs.FunctionComponentElement[P] = js.native
  def createElement[P /* <: js.Object */](
    `type`: reactLib.reactMod.ReactNs.FunctionComponent[P],
    props: reactLib.reactMod.ReactNs.Attributes with (P | scala.Null),
    children: reactLib.reactMod.ReactNs.ReactNode*
  ): reactLib.reactMod.ReactNs.FunctionComponentElement[P] = js.native
  def createElement[P /* <: reactLib.reactMod.ReactNs.DOMAttributes[T] */, T /* <: reactLib.Element */](
    `type`: java.lang.String,
    props: reactLib.reactMod.ReactNs.ClassAttributes[T] with (P | scala.Null),
    children: reactLib.reactMod.ReactNs.ReactNode*
  ): reactLib.reactMod.ReactNs.DOMElement[P, T] = js.native
  def createElement[P /* <: reactLib.reactMod.ReactNs.HTMLAttributes[T] */, T /* <: reactLib.HTMLElement */](`type`: /* import warning: LimitUnionLength.enterTypeRef Was union type with length 114 */ js.Any): reactLib.reactMod.ReactNs.DetailedReactHTMLElement[P, T] = js.native
  def createElement[P /* <: reactLib.reactMod.ReactNs.HTMLAttributes[T] */, T /* <: reactLib.HTMLElement */](
    `type`: /* import warning: LimitUnionLength.enterTypeRef Was union type with length 114 */ js.Any,
    props: reactLib.reactMod.ReactNs.ClassAttributes[T] with (P | scala.Null),
    children: reactLib.reactMod.ReactNs.ReactNode*
  ): reactLib.reactMod.ReactNs.DetailedReactHTMLElement[P, T] = js.native
  @JSName("createElement")
  def createElement_PDOMAttributesTElementDOMElement[P /* <: reactLib.reactMod.ReactNs.DOMAttributes[T] */, T /* <: reactLib.Element */](`type`: java.lang.String): reactLib.reactMod.ReactNs.DOMElement[P, T] = js.native
  @JSName("createElement")
  def createElement_PObjectReactElement[P /* <: js.Object */](`type`: reactLib.reactMod.ReactNs.FunctionComponent[P]): reactLib.reactMod.ReactNs.ReactElement[P] = js.native
  @JSName("createElement")
  def createElement_PObjectReactElement[P /* <: js.Object */](
    `type`: reactLib.reactMod.ReactNs.FunctionComponent[P],
    props: reactLib.reactMod.ReactNs.Attributes with (P | scala.Null),
    children: reactLib.reactMod.ReactNs.ReactNode*
  ): reactLib.reactMod.ReactNs.ReactElement[P] = js.native
  @JSName("createElement")
  def createElement_PObjectTComponentCComponentClass[P /* <: js.Object */, T /* <: reactLib.reactMod.ReactNs.Component[P, reactLib.reactMod.ReactNs.ComponentState, _] */, C /* <: reactLib.reactMod.ReactNs.ComponentClass[P, reactLib.reactMod.ReactNs.ComponentState] */](`type`: reactLib.reactMod.ReactNs.ClassType[P, T, C]): reactLib.reactMod.ReactNs.CElement[P, T] = js.native
  @JSName("createElement")
  def createElement_PObjectTComponentCComponentClass[P /* <: js.Object */, T /* <: reactLib.reactMod.ReactNs.Component[P, reactLib.reactMod.ReactNs.ComponentState, _] */, C /* <: reactLib.reactMod.ReactNs.ComponentClass[P, reactLib.reactMod.ReactNs.ComponentState] */](
    `type`: reactLib.reactMod.ReactNs.ClassType[P, T, C],
    props: reactLib.reactMod.ReactNs.ClassAttributes[T] with (P | scala.Null),
    children: reactLib.reactMod.ReactNs.ReactNode*
  ): reactLib.reactMod.ReactNs.CElement[P, T] = js.native
  @JSName("createElement")
  def createElement_PSVGAttributesTSVGElementReactSVGElement[P /* <: reactLib.reactMod.ReactNs.SVGAttributes[T] */, T /* <: reactLib.SVGElement */](`type`: /* import warning: LimitUnionLength.enterTypeRef Was union type with length 55 */ js.Any): reactLib.reactMod.ReactNs.ReactSVGElement = js.native
  @JSName("createElement")
  def createElement_PSVGAttributesTSVGElementReactSVGElement[P /* <: reactLib.reactMod.ReactNs.SVGAttributes[T] */, T /* <: reactLib.SVGElement */](
    `type`: /* import warning: LimitUnionLength.enterTypeRef Was union type with length 55 */ js.Any,
    props: reactLib.reactMod.ReactNs.ClassAttributes[T] with (P | scala.Null),
    children: reactLib.reactMod.ReactNs.ReactNode*
  ): reactLib.reactMod.ReactNs.ReactSVGElement = js.native
  @JSName("createElement")
  def createElement_input(`type`: rehypeDashReactLib.rehypeDashReactLibStrings.input): reactLib.reactMod.ReactNs.DetailedReactHTMLElement[
    reactLib.reactMod.ReactNs.InputHTMLAttributes[reactLib.HTMLInputElement], 
    reactLib.HTMLInputElement
  ] = js.native
  @JSName("createElement")
  def createElement_input(
    `type`: rehypeDashReactLib.rehypeDashReactLibStrings.input,
    props: reactLib.reactMod.ReactNs.InputHTMLAttributes[reactLib.HTMLInputElement] with (reactLib.reactMod.ReactNs.ClassAttributes[reactLib.HTMLInputElement] | scala.Null),
    children: reactLib.reactMod.ReactNs.ReactNode*
  ): reactLib.reactMod.ReactNs.DetailedReactHTMLElement[
    reactLib.reactMod.ReactNs.InputHTMLAttributes[reactLib.HTMLInputElement], 
    reactLib.HTMLInputElement
  ] = js.native
}

