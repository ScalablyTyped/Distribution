package typings
package reactDashGaLib.reactDashGaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-ga", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val OutboundLink: reactLib.reactMod.ReactNs.ComponentClass[
    reactDashGaLib.reactDashGaMod.OutboundLinkProps with reactLib.reactMod.ReactNs.HTMLProps[reactLib.HTMLAnchorElement], 
    reactLib.reactMod.ReactNs.ComponentState
  ] = js.native
  val plugin: reactDashGaLib.reactDashGaMod.Plugin = js.native
  val testModeAPI: reactDashGaLib.reactDashGaMod.TestModeAPI = js.native
  def event(args: reactDashGaLib.reactDashGaMod.EventArgs): scala.Unit = js.native
  def event(
    args: reactDashGaLib.reactDashGaMod.EventArgs,
    trackerNames: reactDashGaLib.reactDashGaMod.TrackerNames
  ): scala.Unit = js.native
  def exception(fieldsObject: reactDashGaLib.reactDashGaMod.FieldsObject): scala.Unit = js.native
  def exception(
    fieldsObject: reactDashGaLib.reactDashGaMod.FieldsObject,
    trackerNames: reactDashGaLib.reactDashGaMod.TrackerNames
  ): scala.Unit = js.native
  def ga(): js.Any = js.native
  def initialize(trackers: js.Array[reactDashGaLib.reactDashGaMod.Tracker]): scala.Unit = js.native
  def initialize(
    trackers: js.Array[reactDashGaLib.reactDashGaMod.Tracker],
    options: reactDashGaLib.reactDashGaMod.InitializeOptions
  ): scala.Unit = js.native
  def initialize(trackingCode: java.lang.String): scala.Unit = js.native
  def initialize(trackingCode: java.lang.String, options: reactDashGaLib.reactDashGaMod.InitializeOptions): scala.Unit = js.native
  def modalview(name: java.lang.String): scala.Unit = js.native
  def modalview(name: java.lang.String, trackerNames: reactDashGaLib.reactDashGaMod.TrackerNames): scala.Unit = js.native
  def outboundLink(args: reactDashGaLib.reactDashGaMod.OutboundLinkArgs, hitCallback: js.Function0[scala.Unit]): scala.Unit = js.native
  def outboundLink(
    args: reactDashGaLib.reactDashGaMod.OutboundLinkArgs,
    hitCallback: js.Function0[scala.Unit],
    trackerNames: reactDashGaLib.reactDashGaMod.TrackerNames
  ): scala.Unit = js.native
  def pageview(path: java.lang.String): scala.Unit = js.native
  def pageview(path: java.lang.String, trackerNames: reactDashGaLib.reactDashGaMod.TrackerNames): scala.Unit = js.native
  def pageview(
    path: java.lang.String,
    trackerNames: reactDashGaLib.reactDashGaMod.TrackerNames,
    title: java.lang.String
  ): scala.Unit = js.native
  def send(fieldsObject: reactDashGaLib.reactDashGaMod.FieldsObject): scala.Unit = js.native
  def send(
    fieldsObject: reactDashGaLib.reactDashGaMod.FieldsObject,
    trackerNames: reactDashGaLib.reactDashGaMod.TrackerNames
  ): scala.Unit = js.native
  def set(fieldsObject: reactDashGaLib.reactDashGaMod.FieldsObject): scala.Unit = js.native
  def set(
    fieldsObject: reactDashGaLib.reactDashGaMod.FieldsObject,
    trackerNames: reactDashGaLib.reactDashGaMod.TrackerNames
  ): scala.Unit = js.native
  def timing(args: reactDashGaLib.reactDashGaMod.TimingArgs): scala.Unit = js.native
  def timing(
    args: reactDashGaLib.reactDashGaMod.TimingArgs,
    trackerNames: reactDashGaLib.reactDashGaMod.TrackerNames
  ): scala.Unit = js.native
}

