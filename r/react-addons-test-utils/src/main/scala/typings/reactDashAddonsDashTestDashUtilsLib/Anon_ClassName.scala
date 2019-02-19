package typings
package reactDashAddonsDashTestDashUtilsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ClassName extends js.Object {
  val SimulateNs: Anon_Blur = js.native
  def createRenderer(): reactDashAddonsDashTestDashUtilsLib.reactDashAddonsDashTestDashUtilsMod.TestUtilsNs.ShallowRenderer = js.native
  def findAllInRenderedTree(
    root: reactLib.reactMod.Component[_, js.Object, _],
    fn: js.Function1[/* i */ reactLib.reactMod.ReactNs.ReactInstance, scala.Boolean]
  ): js.Array[reactLib.reactMod.ReactNs.ReactInstance] = js.native
  def findRenderedComponentWithType[T /* <: reactLib.reactMod.Component[_, js.Object, _] */, C /* <: reactLib.reactMod.ReactNs.ComponentClass[_, reactLib.reactMod.ReactNs.ComponentState] */](
    root: reactLib.reactMod.Component[_, js.Object, _],
    `type`: reactLib.reactMod.ReactNs.ClassType[_, T, C]
  ): T = js.native
  def findRenderedDOMComponentWithClass(root: reactLib.reactMod.Component[_, js.Object, _], className: java.lang.String): reactLib.Element = js.native
  def findRenderedDOMComponentWithTag(root: reactLib.reactMod.Component[_, js.Object, _], tagName: java.lang.String): reactLib.Element = js.native
  def isCompositeComponent(instance: reactLib.reactMod.ReactNs.ReactInstance): /* is react.react.Component<any, {}, any> */ scala.Boolean = js.native
  def isCompositeComponentWithType[T /* <: reactLib.reactMod.Component[_, js.Object, _] */, C /* <: reactLib.reactMod.ReactNs.ComponentClass[_, reactLib.reactMod.ReactNs.ComponentState] */](
    instance: reactLib.reactMod.ReactNs.ReactInstance,
    `type`: reactLib.reactMod.ReactNs.ClassType[_, T, C]
  ): T = js.native
  def isDOMComponent(instance: reactLib.reactMod.ReactNs.ReactInstance): /* is react.Element */ scala.Boolean = js.native
  def isElementOfType[T /* <: reactLib.HTMLElement */](element: reactLib.reactMod.ReactNs.ReactElement[_], `type`: java.lang.String): /* is react.react.React.ReactHTMLElement<T> */ scala.Boolean = js.native
  def isElementOfType[P](element: reactLib.reactMod.ReactNs.ReactElement[_], `type`: reactLib.reactMod.ReactNs.SFC[P]): /* is react.react.React.SFCElement<P> */ scala.Boolean = js.native
  def isElementOfType[P, T /* <: reactLib.reactMod.Component[P, js.Object, _] */, C /* <: reactLib.reactMod.ReactNs.ComponentClass[P, reactLib.reactMod.ReactNs.ComponentState] */](
    element: reactLib.reactMod.ReactNs.ReactElement[_],
    `type`: reactLib.reactMod.ReactNs.ClassType[P, T, C]
  ): /* is react.react.React.CElement<P, T> */ scala.Boolean = js.native
  @JSName("isElementOfType")
  def isElementOfType_PDOMAttributesTElement[P /* <: reactLib.reactMod.ReactNs.DOMAttributes[js.Object] */, T /* <: reactLib.Element */](element: reactLib.reactMod.ReactNs.ReactElement[_], `type`: java.lang.String): /* is react.react.React.DOMElement<P, T> */ scala.Boolean = js.native
  def mockComponent(
    mocked: reactDashAddonsDashTestDashUtilsLib.reactDashAddonsDashTestDashUtilsMod.TestUtilsNs.MockedComponentClass
  ): /* import warning: ImportType.apply Failed type conversion: typeof TestUtils */ js.Any = js.native
  def mockComponent(
    mocked: reactDashAddonsDashTestDashUtilsLib.reactDashAddonsDashTestDashUtilsMod.TestUtilsNs.MockedComponentClass,
    mockTagName: java.lang.String
  ): /* import warning: ImportType.apply Failed type conversion: typeof TestUtils */ js.Any = js.native
  def renderIntoDocument(element: reactLib.reactMod.ReactNs.SFCElement[_]): scala.Unit = js.native
  def renderIntoDocument[T /* <: reactLib.reactMod.Component[_, js.Object, _] */](element: reactLib.reactMod.ReactNs.CElement[_, T]): T = js.native
  def renderIntoDocument[T /* <: reactLib.Element */](element: reactLib.reactMod.ReactNs.DOMElement[_, T]): T = js.native
  def renderIntoDocument[P](element: reactLib.reactMod.ReactNs.ReactElement[P]): (reactLib.reactMod.Component[P, js.Object, _]) | reactLib.Element | scala.Unit = js.native
  def scryRenderedComponentsWithType[T /* <: reactLib.reactMod.Component[_, js.Object, _] */, C /* <: reactLib.reactMod.ReactNs.ComponentClass[_, reactLib.reactMod.ReactNs.ComponentState] */](
    root: reactLib.reactMod.Component[_, js.Object, _],
    `type`: reactLib.reactMod.ReactNs.ClassType[_, T, C]
  ): js.Array[T] = js.native
  def scryRenderedDOMComponentsWithClass(root: reactLib.reactMod.Component[_, js.Object, _], className: java.lang.String): js.Array[reactLib.Element] = js.native
  def scryRenderedDOMComponentsWithTag(root: reactLib.reactMod.Component[_, js.Object, _], tagName: java.lang.String): js.Array[reactLib.Element] = js.native
}

