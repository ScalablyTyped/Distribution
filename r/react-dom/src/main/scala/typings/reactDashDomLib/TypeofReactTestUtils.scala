package typings
package reactDashDomLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofReactTestUtils extends js.Object {
  val SimulateNs: TypeofSimulate = js.native
  def act(callback: js.Function0[js.UndefOr[scala.Unit]]): reactDashDomLib.testDashUtilsMod.DebugPromiseLike | js.Object = js.native
  def createRenderer(): reactDashDomLib.testDashUtilsMod.ShallowRenderer = js.native
  def findAllInRenderedTree(
    root: reactLib.reactMod.Component[_, js.Object, _],
    fn: js.Function1[/* i */ reactLib.reactMod.ReactInstance, scala.Boolean]
  ): js.Array[reactLib.reactMod.ReactInstance] = js.native
  def findRenderedComponentWithType[T /* <: reactLib.reactMod.Component[_, js.Object, _] */, C /* <: reactLib.reactMod.ComponentClass[_, reactLib.reactMod.ComponentState] */](root: reactLib.reactMod.Component[_, js.Object, _], `type`: reactLib.reactMod.ClassType[_, T, C]): T = js.native
  def findRenderedDOMComponentWithClass(root: reactLib.reactMod.Component[_, js.Object, _], className: java.lang.String): stdLib.Element = js.native
  def findRenderedDOMComponentWithTag(root: reactLib.reactMod.Component[_, js.Object, _], tagName: java.lang.String): stdLib.Element = js.native
  def isCompositeComponent(instance: reactLib.reactMod.ReactInstance): /* is react.react.Component<any, {}, any> */ scala.Boolean = js.native
  def isCompositeComponentWithType[T /* <: reactLib.reactMod.Component[_, js.Object, _] */, C /* <: reactLib.reactMod.ComponentClass[_, reactLib.reactMod.ComponentState] */](instance: reactLib.reactMod.ReactInstance, `type`: reactLib.reactMod.ClassType[_, T, C]): scala.Boolean = js.native
  def isDOMComponent(instance: reactLib.reactMod.ReactInstance): /* is std.Element */ scala.Boolean = js.native
  def isElement(element: js.Any): scala.Boolean = js.native
  def isElementOfType[T /* <: stdLib.HTMLElement */](element: reactLib.reactMod.ReactElement, `type`: java.lang.String): /* is react.react.ReactHTMLElement<T> */ scala.Boolean = js.native
  def isElementOfType[P](element: reactLib.reactMod.ReactElement, `type`: reactLib.reactMod.SFC[P]): /* is react.react.SFCElement<P> */ scala.Boolean = js.native
  def isElementOfType[P, T /* <: reactLib.reactMod.Component[P, js.Object, _] */, C /* <: reactLib.reactMod.ComponentClass[P, reactLib.reactMod.ComponentState] */](element: reactLib.reactMod.ReactElement, `type`: reactLib.reactMod.ClassType[P, T, C]): /* is react.react.CElement<P, T> */ scala.Boolean = js.native
  @JSName("isElementOfType")
  def isElementOfType_PDOMAttributesTElement[P /* <: reactLib.reactMod.DOMAttributes[js.Object] */, T /* <: stdLib.Element */](element: reactLib.reactMod.ReactElement, `type`: java.lang.String): /* is react.react.DOMElement<P, T> */ scala.Boolean = js.native
  def mockComponent(mocked: reactDashDomLib.testDashUtilsMod.MockedComponentClass): /* import warning: ImportType.apply Failed type conversion: typeof ReactTestUtils */ js.Any = js.native
  def mockComponent(mocked: reactDashDomLib.testDashUtilsMod.MockedComponentClass, mockTagName: java.lang.String): /* import warning: ImportType.apply Failed type conversion: typeof ReactTestUtils */ js.Any = js.native
  def renderIntoDocument(element: reactLib.reactMod.SFCElement[_]): scala.Unit = js.native
  def renderIntoDocument[T /* <: stdLib.Element */](element: reactLib.reactMod.DOMElement[_, T]): T = js.native
  def renderIntoDocument[P](element: reactLib.reactMod.ReactElement): (reactLib.reactMod.Component[P, js.Object, _]) | stdLib.Element | scala.Unit = js.native
  def renderIntoDocument[P, T /* <: reactLib.reactMod.Component[P, js.Object, _] */](element: reactLib.reactMod.CElement[P, T]): T = js.native
  def scryRenderedComponentsWithType[T /* <: reactLib.reactMod.Component[_, js.Object, _] */, C /* <: reactLib.reactMod.ComponentClass[_, reactLib.reactMod.ComponentState] */](root: reactLib.reactMod.Component[_, js.Object, _], `type`: reactLib.reactMod.ClassType[_, T, C]): js.Array[T] = js.native
  def scryRenderedDOMComponentsWithClass(root: reactLib.reactMod.Component[_, js.Object, _], className: java.lang.String): js.Array[stdLib.Element] = js.native
  def scryRenderedDOMComponentsWithTag(root: reactLib.reactMod.Component[_, js.Object, _], tagName: java.lang.String): js.Array[stdLib.Element] = js.native
}

