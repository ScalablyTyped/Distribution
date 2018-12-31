package typings
package segmentDashAnalyticsLib.SegmentAnalyticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// The actual analytics.js object
@js.native
trait AnalyticsJS extends js.Object {
  /* The alias method combines two previously unassociated user identities.
    This comes in handy if the same user visits from two different devices
    and you want to combine their history.
    Some providers also don’t alias automatically for you when an anonymous
    user signs up (like Mixpanel), so you need to call alias manually right
    after sign up with their brand new userId. */
  def alias(userId: java.lang.String): scala.Unit = js.native
  def alias(userId: java.lang.String, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def alias(userId: java.lang.String, options: SegmentOpts): scala.Unit = js.native
  def alias(userId: java.lang.String, options: SegmentOpts, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def alias(userId: java.lang.String, previousId: java.lang.String): scala.Unit = js.native
  def alias(userId: java.lang.String, previousId: java.lang.String, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def alias(userId: java.lang.String, previousId: java.lang.String, options: SegmentOpts): scala.Unit = js.native
  def alias(
    userId: java.lang.String,
    previousId: java.lang.String,
    options: SegmentOpts,
    callback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  /* Analytics.js has a debug mode that logs helpful messages to the
    console. */
  def debug(): scala.Unit = js.native
  def debug(state: scala.Boolean): scala.Unit = js.native
  def group(): segmentDashAnalyticsLib.Anon_Traits = js.native
  /* The group method associates an individual user with a group. The group
    can a company, organization, account, project, team or any other name
    you came up with for the same concept. */
  def group(groupId: java.lang.String): scala.Unit = js.native
  def group(groupId: java.lang.String, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def group(groupId: java.lang.String, traits: js.Object): scala.Unit = js.native
  def group(groupId: java.lang.String, traits: js.Object, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def group(groupId: java.lang.String, traits: js.Object, options: SegmentOpts): scala.Unit = js.native
  def group(
    groupId: java.lang.String,
    traits: js.Object,
    options: SegmentOpts,
    callback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def identify(): scala.Unit = js.native
  def identify(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def identify(traits: js.Object): scala.Unit = js.native
  def identify(traits: js.Object, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def identify(traits: js.Object, options: SegmentOpts): scala.Unit = js.native
  def identify(traits: js.Object, options: SegmentOpts, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /* The identify method is how you tie one of your users and their actions
    to a recognizable userId and traits. */
  def identify(userId: java.lang.String): scala.Unit = js.native
  def identify(userId: java.lang.String, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def identify(userId: java.lang.String, traits: js.Object): scala.Unit = js.native
  def identify(userId: java.lang.String, traits: js.Object, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def identify(userId: java.lang.String, traits: js.Object, options: SegmentOpts): scala.Unit = js.native
  def identify(
    userId: java.lang.String,
    traits: js.Object,
    options: SegmentOpts,
    callback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  /* Configure Segment with write key */
  def load(writeKey: java.lang.String): scala.Unit = js.native
  /* The global analytics object emits events whenever you call alias, group,
    identify, track or page. That way you can listen to those events and run
    your own custom code. */
  def on(event: java.lang.String, callback: segmentDashAnalyticsLib.Anon_Event): scala.Unit = js.native
  def page(): scala.Unit = js.native
  def page(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /* The page method lets you record page views on your website, along with
    optional extra information about the page being viewed. */
  def page(category: java.lang.String, name: java.lang.String): scala.Unit = js.native
  def page(category: java.lang.String, name: java.lang.String, properties: js.Object): scala.Unit = js.native
  def page(category: java.lang.String, name: java.lang.String, properties: js.Object, options: SegmentOpts): scala.Unit = js.native
  def page(
    category: java.lang.String,
    name: java.lang.String,
    properties: js.Object,
    options: SegmentOpts,
    callback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def page(name: java.lang.String): scala.Unit = js.native
  def page(name: java.lang.String, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def page(name: java.lang.String, properties: js.Object): scala.Unit = js.native
  def page(name: java.lang.String, properties: js.Object, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def page(name: java.lang.String, properties: js.Object, options: SegmentOpts): scala.Unit = js.native
  def page(
    name: java.lang.String,
    properties: js.Object,
    options: SegmentOpts,
    callback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def page(properties: js.Object): scala.Unit = js.native
  def page(properties: js.Object, options: SegmentOpts): scala.Unit = js.native
  def page(properties: js.Object, options: SegmentOpts, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /* The ready method allows you to pass in a callback that will be called as
    soon as all of your enabled integrations have loaded. It’s like jQuery’s
    ready method, except for integrations. */
  def ready(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /* If you need to clear the user and group id and traits we’ve added a
    reset function that is most commonly used when your identified users
    logout of your application. */
  def reset(): scala.Unit = js.native
  /* You can extend the length (in milliseconds) of the method callbacks and
    helpers */
  def timeout(milliseconds: scala.Double): scala.Unit = js.native
  /* The track method lets you record any actions your users perform. */
  def track(event: java.lang.String): scala.Unit = js.native
  def track(event: java.lang.String, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def track(event: java.lang.String, properties: js.Object): scala.Unit = js.native
  def track(event: java.lang.String, properties: js.Object, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def track(event: java.lang.String, properties: js.Object, options: SegmentOpts): scala.Unit = js.native
  def track(
    event: java.lang.String,
    properties: js.Object,
    options: SegmentOpts,
    callback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def trackForm(elements: js.Array[stdLib.Element], event: java.lang.String): scala.Unit = js.native
  def trackForm(elements: js.Array[stdLib.Element], event: java.lang.String, properties: js.Object): scala.Unit = js.native
  def trackForm(
    elements: js.Array[stdLib.Element],
    event: java.lang.String,
    properties: segmentDashAnalyticsLib.Anon_ElmElement
  ): scala.Unit = js.native
  def trackForm(elements: js.Array[stdLib.Element], event: segmentDashAnalyticsLib.Anon_Elm): scala.Unit = js.native
  def trackForm(elements: js.Array[stdLib.Element], event: segmentDashAnalyticsLib.Anon_Elm, properties: js.Object): scala.Unit = js.native
  def trackForm(
    elements: js.Array[stdLib.Element],
    event: segmentDashAnalyticsLib.Anon_Elm,
    properties: segmentDashAnalyticsLib.Anon_ElmElement
  ): scala.Unit = js.native
  /* trackForm is a helper that binds a track call to a form submission.
    Usually the page would change before you could call track, but with
    trackForm a small timeout is inserted to give the track call enough
    time to fire. */
  def trackForm(elements: segmentDashAnalyticsLib.JQuery, event: java.lang.String): scala.Unit = js.native
  def trackForm(elements: segmentDashAnalyticsLib.JQuery, event: java.lang.String, properties: js.Object): scala.Unit = js.native
  def trackForm(
    elements: segmentDashAnalyticsLib.JQuery,
    event: java.lang.String,
    properties: segmentDashAnalyticsLib.Anon_ElmElement
  ): scala.Unit = js.native
  def trackForm(elements: segmentDashAnalyticsLib.JQuery, event: segmentDashAnalyticsLib.Anon_Elm): scala.Unit = js.native
  def trackForm(
    elements: segmentDashAnalyticsLib.JQuery,
    event: segmentDashAnalyticsLib.Anon_Elm,
    properties: js.Object
  ): scala.Unit = js.native
  def trackForm(
    elements: segmentDashAnalyticsLib.JQuery,
    event: segmentDashAnalyticsLib.Anon_Elm,
    properties: segmentDashAnalyticsLib.Anon_ElmElement
  ): scala.Unit = js.native
  def trackForm(elements: stdLib.Element, event: java.lang.String): scala.Unit = js.native
  def trackForm(elements: stdLib.Element, event: java.lang.String, properties: js.Object): scala.Unit = js.native
  def trackForm(
    elements: stdLib.Element,
    event: java.lang.String,
    properties: segmentDashAnalyticsLib.Anon_ElmElement
  ): scala.Unit = js.native
  def trackForm(elements: stdLib.Element, event: segmentDashAnalyticsLib.Anon_Elm): scala.Unit = js.native
  def trackForm(elements: stdLib.Element, event: segmentDashAnalyticsLib.Anon_Elm, properties: js.Object): scala.Unit = js.native
  def trackForm(
    elements: stdLib.Element,
    event: segmentDashAnalyticsLib.Anon_Elm,
    properties: segmentDashAnalyticsLib.Anon_ElmElement
  ): scala.Unit = js.native
  def trackLink(elements: js.Array[stdLib.Element], event: java.lang.String): scala.Unit = js.native
  def trackLink(elements: js.Array[stdLib.Element], event: java.lang.String, properties: js.Object): scala.Unit = js.native
  def trackLink(
    elements: js.Array[stdLib.Element],
    event: java.lang.String,
    properties: segmentDashAnalyticsLib.Anon_ElmElement
  ): scala.Unit = js.native
  def trackLink(elements: js.Array[stdLib.Element], event: segmentDashAnalyticsLib.Anon_Elm): scala.Unit = js.native
  def trackLink(elements: js.Array[stdLib.Element], event: segmentDashAnalyticsLib.Anon_Elm, properties: js.Object): scala.Unit = js.native
  def trackLink(
    elements: js.Array[stdLib.Element],
    event: segmentDashAnalyticsLib.Anon_Elm,
    properties: segmentDashAnalyticsLib.Anon_ElmElement
  ): scala.Unit = js.native
  /* trackLink is a helper that binds a track call to whenever a link is
    clicked. Usually the page would change before you could call track, but
    with trackLink a small timeout is inserted to give the track call enough
    time to fire. */
  def trackLink(elements: segmentDashAnalyticsLib.JQuery, event: java.lang.String): scala.Unit = js.native
  def trackLink(elements: segmentDashAnalyticsLib.JQuery, event: java.lang.String, properties: js.Object): scala.Unit = js.native
  def trackLink(
    elements: segmentDashAnalyticsLib.JQuery,
    event: java.lang.String,
    properties: segmentDashAnalyticsLib.Anon_ElmElement
  ): scala.Unit = js.native
  def trackLink(elements: segmentDashAnalyticsLib.JQuery, event: segmentDashAnalyticsLib.Anon_Elm): scala.Unit = js.native
  def trackLink(
    elements: segmentDashAnalyticsLib.JQuery,
    event: segmentDashAnalyticsLib.Anon_Elm,
    properties: js.Object
  ): scala.Unit = js.native
  def trackLink(
    elements: segmentDashAnalyticsLib.JQuery,
    event: segmentDashAnalyticsLib.Anon_Elm,
    properties: segmentDashAnalyticsLib.Anon_ElmElement
  ): scala.Unit = js.native
  def trackLink(elements: stdLib.Element, event: java.lang.String): scala.Unit = js.native
  def trackLink(elements: stdLib.Element, event: java.lang.String, properties: js.Object): scala.Unit = js.native
  def trackLink(
    elements: stdLib.Element,
    event: java.lang.String,
    properties: segmentDashAnalyticsLib.Anon_ElmElement
  ): scala.Unit = js.native
  def trackLink(elements: stdLib.Element, event: segmentDashAnalyticsLib.Anon_Elm): scala.Unit = js.native
  def trackLink(elements: stdLib.Element, event: segmentDashAnalyticsLib.Anon_Elm, properties: js.Object): scala.Unit = js.native
  def trackLink(
    elements: stdLib.Element,
    event: segmentDashAnalyticsLib.Anon_Elm,
    properties: segmentDashAnalyticsLib.Anon_ElmElement
  ): scala.Unit = js.native
  /* Once Analytics.js loaded, you can retrieve information about the
    currently identified user or group like their id and traits. */
  def user(): segmentDashAnalyticsLib.Anon_Logout = js.native
}

