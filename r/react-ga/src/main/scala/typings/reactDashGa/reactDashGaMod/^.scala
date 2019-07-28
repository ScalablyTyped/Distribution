package typings.reactDashGa.reactDashGaMod

import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.HTMLProps
import typings.std.HTMLAnchorElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-ga", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val OutboundLink: ComponentClass[OutboundLinkProps with HTMLProps[HTMLAnchorElement], ComponentState] = js.native
  val plugin: Plugin = js.native
  val testModeAPI: TestModeAPI = js.native
  def event(args: EventArgs): Unit = js.native
  def event(args: EventArgs, trackerNames: TrackerNames): Unit = js.native
  def exception(fieldsObject: FieldsObject): Unit = js.native
  def exception(fieldsObject: FieldsObject, trackerNames: TrackerNames): Unit = js.native
  def ga(args: js.Any*): js.Any = js.native
  def initialize(trackers: js.Array[Tracker]): Unit = js.native
  def initialize(trackers: js.Array[Tracker], options: InitializeOptions): Unit = js.native
  def initialize(trackingCode: String): Unit = js.native
  def initialize(trackingCode: String, options: InitializeOptions): Unit = js.native
  def modalview(name: String): Unit = js.native
  def modalview(name: String, trackerNames: TrackerNames): Unit = js.native
  def outboundLink(args: OutboundLinkArgs, hitCallback: js.Function0[Unit]): Unit = js.native
  def outboundLink(args: OutboundLinkArgs, hitCallback: js.Function0[Unit], trackerNames: TrackerNames): Unit = js.native
  def pageview(path: String): Unit = js.native
  def pageview(path: String, trackerNames: TrackerNames): Unit = js.native
  def pageview(path: String, trackerNames: TrackerNames, title: String): Unit = js.native
  def resetCalls(): Unit = js.native
  def send(fieldsObject: FieldsObject): Unit = js.native
  def send(fieldsObject: FieldsObject, trackerNames: TrackerNames): Unit = js.native
  def set(fieldsObject: FieldsObject): Unit = js.native
  def set(fieldsObject: FieldsObject, trackerNames: TrackerNames): Unit = js.native
  def timing(args: TimingArgs): Unit = js.native
  def timing(args: TimingArgs, trackerNames: TrackerNames): Unit = js.native
}

