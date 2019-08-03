package typings.segmentDashAnalytics.SegmentAnalyticsNs

import typings.segmentDashAnalytics.Anon_AnonymousId
import typings.segmentDashAnalytics.Anon_Id
import typings.segmentDashAnalytics.Fn_Elm
import typings.segmentDashAnalytics.Fn_ElmElement
import typings.segmentDashAnalytics.Fn_Event
import typings.segmentDashAnalytics.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// The actual analytics.js object
@js.native
trait AnalyticsJS extends js.Object {
  /* Define a new integration */
  def addIntegration(integration: js.Function1[/* options */ js.Any, Unit]): this.type = js.native
  /* The alias method combines two previously unassociated user identities.
    This comes in handy if the same user visits from two different devices
    and you want to combine their history.
    Some providers also don’t alias automatically for you when an anonymous
    user signs up (like Mixpanel), so you need to call alias manually right
    after sign up with their brand new userId. */
  def alias(userId: String): Unit = js.native
  def alias(userId: String, callback: js.Function0[Unit]): Unit = js.native
  def alias(userId: String, options: SegmentOpts): Unit = js.native
  def alias(userId: String, options: SegmentOpts, callback: js.Function0[Unit]): Unit = js.native
  def alias(userId: String, previousId: String): Unit = js.native
  def alias(userId: String, previousId: String, callback: js.Function0[Unit]): Unit = js.native
  def alias(userId: String, previousId: String, options: SegmentOpts): Unit = js.native
  def alias(userId: String, previousId: String, options: SegmentOpts, callback: js.Function0[Unit]): Unit = js.native
  /* Analytics.js has a debug mode that logs helpful messages to the
    console. */
  def debug(): Unit = js.native
  def debug(state: Boolean): Unit = js.native
  def group(): Anon_Id = js.native
  /* The group method associates an individual user with a group. The group
    can a company, organization, account, project, team or any other name
    you came up with for the same concept. */
  def group(groupId: String): Unit = js.native
  def group(groupId: String, callback: js.Function0[Unit]): Unit = js.native
  def group(groupId: String, traits: js.Object): Unit = js.native
  def group(groupId: String, traits: js.Object, callback: js.Function0[Unit]): Unit = js.native
  def group(groupId: String, traits: js.Object, options: SegmentOpts): Unit = js.native
  def group(groupId: String, traits: js.Object, options: SegmentOpts, callback: js.Function0[Unit]): Unit = js.native
  def identify(): Unit = js.native
  def identify(callback: js.Function0[Unit]): Unit = js.native
  def identify(traits: js.Object): Unit = js.native
  def identify(traits: js.Object, callback: js.Function0[Unit]): Unit = js.native
  def identify(traits: js.Object, options: SegmentOpts): Unit = js.native
  def identify(traits: js.Object, options: SegmentOpts, callback: js.Function0[Unit]): Unit = js.native
  /* The identify method is how you tie one of your users and their actions
    to a recognizable userId and traits. */
  def identify(userId: String): Unit = js.native
  def identify(userId: String, callback: js.Function0[Unit]): Unit = js.native
  def identify(userId: String, traits: js.Object): Unit = js.native
  def identify(userId: String, traits: js.Object, callback: js.Function0[Unit]): Unit = js.native
  def identify(userId: String, traits: js.Object, options: SegmentOpts): Unit = js.native
  def identify(userId: String, traits: js.Object, options: SegmentOpts, callback: js.Function0[Unit]): Unit = js.native
  /* Initialize with the given integration `settings` and `options`. */
  def init(): this.type = js.native
  def init(settings: IntegrationsSettings): this.type = js.native
  def init(settings: IntegrationsSettings, options: InitOptions): this.type = js.native
  /* Configure Segment with write key */
  def load(writeKey: String): Unit = js.native
  def load(writeKey: String, options: SegmentOpts): Unit = js.native
  /* The global analytics object emits events whenever you call alias, group,
    identify, track or page. That way you can listen to those events and run
    your own custom code. */
  def on(event: String, callback: Fn_Event): Unit = js.native
  /* The page method lets you record page views on your website, along with
    optional extra information about the page being viewed. */
  def page(): Unit = js.native
  def page(callback: js.Function0[Unit]): Unit = js.native
  def page(category: String): Unit = js.native
  def page(category: String, name: String): Unit = js.native
  def page(category: String, name: String, properties: js.Object): Unit = js.native
  def page(category: String, name: String, properties: js.Object, options: SegmentOpts): Unit = js.native
  def page(
    category: String,
    name: String,
    properties: js.Object,
    options: SegmentOpts,
    callback: js.Function0[Unit]
  ): Unit = js.native
  def page(name: String, callback: js.Function0[Unit]): Unit = js.native
  def page(name: String, properties: js.Object): Unit = js.native
  def page(name: String, properties: js.Object, callback: js.Function0[Unit]): Unit = js.native
  def page(name: String, properties: js.Object, options: SegmentOpts): Unit = js.native
  def page(name: String, properties: js.Object, options: SegmentOpts, callback: js.Function0[Unit]): Unit = js.native
  def page(properties: js.Object): Unit = js.native
  def page(properties: js.Object, options: SegmentOpts): Unit = js.native
  def page(properties: js.Object, options: SegmentOpts, callback: js.Function0[Unit]): Unit = js.native
  /* The ready method allows you to pass in a callback that will be called as
    soon as all of your enabled integrations have loaded. It’s like jQuery’s
    ready method, except for integrations. */
  def ready(callback: js.Function0[Unit]): Unit = js.native
  /* If you need to clear the user and group id and traits we’ve added a
    reset function that is most commonly used when your identified users
    logout of your application. */
  def reset(): Unit = js.native
  /*  Set the user's `id`. */
  def setAnonymousId(id: String): this.type = js.native
  /* You can extend the length (in milliseconds) of the method callbacks and
    helpers */
  def timeout(milliseconds: Double): Unit = js.native
  /* The track method lets you record any actions your users perform. */
  def track(event: String): Unit = js.native
  def track(event: String, callback: js.Function0[Unit]): Unit = js.native
  def track(event: String, properties: js.Object): Unit = js.native
  def track(event: String, properties: js.Object, callback: js.Function0[Unit]): Unit = js.native
  def track(event: String, properties: js.Object, options: SegmentOpts): Unit = js.native
  def track(event: String, properties: js.Object, options: SegmentOpts, callback: js.Function0[Unit]): Unit = js.native
  def trackForm(elements: js.Array[Element], event: String): Unit = js.native
  def trackForm(elements: js.Array[Element], event: String, properties: js.Object): Unit = js.native
  def trackForm(elements: js.Array[Element], event: String, properties: Fn_ElmElement): Unit = js.native
  def trackForm(elements: js.Array[Element], event: Fn_Elm): Unit = js.native
  def trackForm(elements: js.Array[Element], event: Fn_Elm, properties: js.Object): Unit = js.native
  def trackForm(elements: js.Array[Element], event: Fn_Elm, properties: Fn_ElmElement): Unit = js.native
  /* trackForm is a helper that binds a track call to a form submission.
    Usually the page would change before you could call track, but with
    trackForm a small timeout is inserted to give the track call enough
    time to fire. */
  def trackForm(elements: JQuery, event: String): Unit = js.native
  def trackForm(elements: JQuery, event: String, properties: js.Object): Unit = js.native
  def trackForm(elements: JQuery, event: String, properties: Fn_ElmElement): Unit = js.native
  def trackForm(elements: JQuery, event: Fn_Elm): Unit = js.native
  def trackForm(elements: JQuery, event: Fn_Elm, properties: js.Object): Unit = js.native
  def trackForm(elements: JQuery, event: Fn_Elm, properties: Fn_ElmElement): Unit = js.native
  def trackForm(elements: Element, event: String): Unit = js.native
  def trackForm(elements: Element, event: String, properties: js.Object): Unit = js.native
  def trackForm(elements: Element, event: String, properties: Fn_ElmElement): Unit = js.native
  def trackForm(elements: Element, event: Fn_Elm): Unit = js.native
  def trackForm(elements: Element, event: Fn_Elm, properties: js.Object): Unit = js.native
  def trackForm(elements: Element, event: Fn_Elm, properties: Fn_ElmElement): Unit = js.native
  def trackLink(elements: js.Array[Element], event: String): Unit = js.native
  def trackLink(elements: js.Array[Element], event: String, properties: js.Object): Unit = js.native
  def trackLink(elements: js.Array[Element], event: String, properties: Fn_ElmElement): Unit = js.native
  def trackLink(elements: js.Array[Element], event: Fn_Elm): Unit = js.native
  def trackLink(elements: js.Array[Element], event: Fn_Elm, properties: js.Object): Unit = js.native
  def trackLink(elements: js.Array[Element], event: Fn_Elm, properties: Fn_ElmElement): Unit = js.native
  /* trackLink is a helper that binds a track call to whenever a link is
    clicked. Usually the page would change before you could call track, but
    with trackLink a small timeout is inserted to give the track call enough
    time to fire. */
  def trackLink(elements: JQuery, event: String): Unit = js.native
  def trackLink(elements: JQuery, event: String, properties: js.Object): Unit = js.native
  def trackLink(elements: JQuery, event: String, properties: Fn_ElmElement): Unit = js.native
  def trackLink(elements: JQuery, event: Fn_Elm): Unit = js.native
  def trackLink(elements: JQuery, event: Fn_Elm, properties: js.Object): Unit = js.native
  def trackLink(elements: JQuery, event: Fn_Elm, properties: Fn_ElmElement): Unit = js.native
  def trackLink(elements: Element, event: String): Unit = js.native
  def trackLink(elements: Element, event: String, properties: js.Object): Unit = js.native
  def trackLink(elements: Element, event: String, properties: Fn_ElmElement): Unit = js.native
  def trackLink(elements: Element, event: Fn_Elm): Unit = js.native
  def trackLink(elements: Element, event: Fn_Elm, properties: js.Object): Unit = js.native
  def trackLink(elements: Element, event: Fn_Elm, properties: Fn_ElmElement): Unit = js.native
  /* Use a plugin */
  def use(plugin: js.Function1[/* analytics */ this.type, Unit]): this.type = js.native
  /* Once Analytics.js loaded, you can retrieve information about the
    currently identified user or group like their id and traits. */
  def user(): Anon_AnonymousId = js.native
}

