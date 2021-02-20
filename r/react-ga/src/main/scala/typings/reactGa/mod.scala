package typings.reactGa

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.HTMLProps
import typings.reactGa.reactGaStrings.beacon
import typings.reactGa.reactGaStrings.image
import typings.reactGa.reactGaStrings.xhr
import typings.std.HTMLAnchorElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-ga", "OutboundLink")
  @js.native
  class OutboundLink_ protected ()
    extends Component[OutboundLinkProps with HTMLProps[HTMLAnchorElement], ComponentState, js.Any] {
    def this(props: OutboundLinkProps with HTMLProps[HTMLAnchorElement]) = this()
    def this(props: OutboundLinkProps with HTMLProps[HTMLAnchorElement], context: js.Any) = this()
  }
  
  @JSImport("react-ga", "OutboundLink")
  @js.native
  val OutboundLink_ : ComponentClass[OutboundLinkProps with HTMLProps[HTMLAnchorElement], ComponentState] = js.native
  
  @JSImport("react-ga", "addTrackers")
  @js.native
  def addTrackers(trackers: js.Array[Tracker]): Unit = js.native
  @JSImport("react-ga", "addTrackers")
  @js.native
  def addTrackers(trackingCode: String): Unit = js.native
  
  @JSImport("react-ga", "event")
  @js.native
  def event(args: EventArgs): Unit = js.native
  @JSImport("react-ga", "event")
  @js.native
  def event(args: EventArgs, trackerNames: TrackerNames): Unit = js.native
  
  @JSImport("react-ga", "exception")
  @js.native
  def exception(fieldsObject: FieldsObject): Unit = js.native
  @JSImport("react-ga", "exception")
  @js.native
  def exception(fieldsObject: FieldsObject, trackerNames: TrackerNames): Unit = js.native
  
  @JSImport("react-ga", "ga")
  @js.native
  def ga(): js.Function1[/* repeated */ js.Any, Unit] = js.native
  @JSImport("react-ga", "ga")
  @js.native
  def ga(args: js.Any*): Unit = js.native
  
  @JSImport("react-ga", "initialize")
  @js.native
  def initialize(trackers: js.Array[Tracker]): Unit = js.native
  @JSImport("react-ga", "initialize")
  @js.native
  def initialize(trackers: js.Array[Tracker], options: InitializeOptions): Unit = js.native
  @JSImport("react-ga", "initialize")
  @js.native
  def initialize(trackingCode: String): Unit = js.native
  @JSImport("react-ga", "initialize")
  @js.native
  def initialize(trackingCode: String, options: InitializeOptions): Unit = js.native
  
  @JSImport("react-ga", "modalview")
  @js.native
  def modalview(name: String): Unit = js.native
  @JSImport("react-ga", "modalview")
  @js.native
  def modalview(name: String, trackerNames: TrackerNames): Unit = js.native
  
  @JSImport("react-ga", "outboundLink")
  @js.native
  def outboundLink(args: OutboundLinkArgs, hitCallback: js.Function0[Unit]): Unit = js.native
  @JSImport("react-ga", "outboundLink")
  @js.native
  def outboundLink(args: OutboundLinkArgs, hitCallback: js.Function0[Unit], trackerNames: TrackerNames): Unit = js.native
  
  @JSImport("react-ga", "pageview")
  @js.native
  def pageview(path: String): Unit = js.native
  @JSImport("react-ga", "pageview")
  @js.native
  def pageview(path: String, trackerNames: js.UndefOr[scala.Nothing], title: String): Unit = js.native
  @JSImport("react-ga", "pageview")
  @js.native
  def pageview(path: String, trackerNames: TrackerNames): Unit = js.native
  @JSImport("react-ga", "pageview")
  @js.native
  def pageview(path: String, trackerNames: TrackerNames, title: String): Unit = js.native
  
  @JSImport("react-ga", "plugin")
  @js.native
  val plugin: Plugin_ = js.native
  
  @JSImport("react-ga", "resetCalls")
  @js.native
  def resetCalls(): Unit = js.native
  
  @JSImport("react-ga", "send")
  @js.native
  def send(fieldsObject: FieldsObject): Unit = js.native
  @JSImport("react-ga", "send")
  @js.native
  def send(fieldsObject: FieldsObject, trackerNames: TrackerNames): Unit = js.native
  
  @JSImport("react-ga", "set")
  @js.native
  def set(fieldsObject: FieldsObject): Unit = js.native
  @JSImport("react-ga", "set")
  @js.native
  def set(fieldsObject: FieldsObject, trackerNames: TrackerNames): Unit = js.native
  
  @JSImport("react-ga", "testModeAPI")
  @js.native
  val testModeAPI: TestModeAPI_ = js.native
  
  @JSImport("react-ga", "timing")
  @js.native
  def timing(args: TimingArgs): Unit = js.native
  @JSImport("react-ga", "timing")
  @js.native
  def timing(args: TimingArgs, trackerNames: TrackerNames): Unit = js.native
  
  @js.native
  trait EventArgs extends StObject {
    
    /** The type of interaction (e.g. 'play') */
    var action: String = js.native
    
    /** Typically the object that was interacted with (e.g. 'Video') */
    var category: String = js.native
    
    /** Custom dimensions */
    var dimension1: js.UndefOr[String] = js.native
    
    var dimension10: js.UndefOr[String] = js.native
    
    var dimension11: js.UndefOr[String] = js.native
    
    var dimension12: js.UndefOr[String] = js.native
    
    var dimension13: js.UndefOr[String] = js.native
    
    var dimension14: js.UndefOr[String] = js.native
    
    var dimension15: js.UndefOr[String] = js.native
    
    var dimension16: js.UndefOr[String] = js.native
    
    var dimension17: js.UndefOr[String] = js.native
    
    var dimension18: js.UndefOr[String] = js.native
    
    var dimension19: js.UndefOr[String] = js.native
    
    var dimension2: js.UndefOr[String] = js.native
    
    var dimension20: js.UndefOr[String] = js.native
    
    var dimension3: js.UndefOr[String] = js.native
    
    var dimension4: js.UndefOr[String] = js.native
    
    var dimension5: js.UndefOr[String] = js.native
    
    var dimension6: js.UndefOr[String] = js.native
    
    var dimension7: js.UndefOr[String] = js.native
    
    var dimension8: js.UndefOr[String] = js.native
    
    var dimension9: js.UndefOr[String] = js.native
    
    /** Useful for categorizing events (e.g. 'Fall Campaign') */
    var label: js.UndefOr[String] = js.native
    
    /** Custom metrics */
    var metric1: js.UndefOr[Double] = js.native
    
    var metric10: js.UndefOr[Double] = js.native
    
    var metric11: js.UndefOr[Double] = js.native
    
    var metric12: js.UndefOr[Double] = js.native
    
    var metric13: js.UndefOr[Double] = js.native
    
    var metric14: js.UndefOr[Double] = js.native
    
    var metric15: js.UndefOr[Double] = js.native
    
    var metric16: js.UndefOr[Double] = js.native
    
    var metric17: js.UndefOr[Double] = js.native
    
    var metric18: js.UndefOr[Double] = js.native
    
    var metric19: js.UndefOr[Double] = js.native
    
    var metric2: js.UndefOr[Double] = js.native
    
    var metric20: js.UndefOr[Double] = js.native
    
    var metric3: js.UndefOr[Double] = js.native
    
    var metric4: js.UndefOr[Double] = js.native
    
    var metric5: js.UndefOr[Double] = js.native
    
    var metric6: js.UndefOr[Double] = js.native
    
    var metric7: js.UndefOr[Double] = js.native
    
    var metric8: js.UndefOr[Double] = js.native
    
    var metric9: js.UndefOr[Double] = js.native
    
    /** Specifies that a hit be considered non-interactive. */
    var nonInteraction: js.UndefOr[Boolean] = js.native
    
    /**
      * This specifies the transport mechanism with which hits will be sent.
      * The options are 'beacon', 'xhr', or 'image'. By default, analytics.js
      * will try to figure out the best method based on the hit size and browser
      * capabilities. If you specify 'beacon' and the user's browser does not support
      * the `navigator.sendBeacon` method, it will fall back to 'image' or 'xhr'
      * depending on hit size.
      */
    var transport: js.UndefOr[beacon | xhr | image] = js.native
    
    /** A numeric value associated with the event (e.g. 42) */
    var value: js.UndefOr[Double] = js.native
  }
  object EventArgs {
    
    @scala.inline
    def apply(action: String, category: String): EventArgs = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], category = category.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventArgs]
    }
    
    @scala.inline
    implicit class EventArgsMutableBuilder[Self <: EventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension1(value: String): Self = StObject.set(x, "dimension1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension10(value: String): Self = StObject.set(x, "dimension10", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension10Undefined: Self = StObject.set(x, "dimension10", js.undefined)
      
      @scala.inline
      def setDimension11(value: String): Self = StObject.set(x, "dimension11", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension11Undefined: Self = StObject.set(x, "dimension11", js.undefined)
      
      @scala.inline
      def setDimension12(value: String): Self = StObject.set(x, "dimension12", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension12Undefined: Self = StObject.set(x, "dimension12", js.undefined)
      
      @scala.inline
      def setDimension13(value: String): Self = StObject.set(x, "dimension13", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension13Undefined: Self = StObject.set(x, "dimension13", js.undefined)
      
      @scala.inline
      def setDimension14(value: String): Self = StObject.set(x, "dimension14", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension14Undefined: Self = StObject.set(x, "dimension14", js.undefined)
      
      @scala.inline
      def setDimension15(value: String): Self = StObject.set(x, "dimension15", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension15Undefined: Self = StObject.set(x, "dimension15", js.undefined)
      
      @scala.inline
      def setDimension16(value: String): Self = StObject.set(x, "dimension16", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension16Undefined: Self = StObject.set(x, "dimension16", js.undefined)
      
      @scala.inline
      def setDimension17(value: String): Self = StObject.set(x, "dimension17", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension17Undefined: Self = StObject.set(x, "dimension17", js.undefined)
      
      @scala.inline
      def setDimension18(value: String): Self = StObject.set(x, "dimension18", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension18Undefined: Self = StObject.set(x, "dimension18", js.undefined)
      
      @scala.inline
      def setDimension19(value: String): Self = StObject.set(x, "dimension19", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension19Undefined: Self = StObject.set(x, "dimension19", js.undefined)
      
      @scala.inline
      def setDimension1Undefined: Self = StObject.set(x, "dimension1", js.undefined)
      
      @scala.inline
      def setDimension2(value: String): Self = StObject.set(x, "dimension2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension20(value: String): Self = StObject.set(x, "dimension20", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension20Undefined: Self = StObject.set(x, "dimension20", js.undefined)
      
      @scala.inline
      def setDimension2Undefined: Self = StObject.set(x, "dimension2", js.undefined)
      
      @scala.inline
      def setDimension3(value: String): Self = StObject.set(x, "dimension3", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension3Undefined: Self = StObject.set(x, "dimension3", js.undefined)
      
      @scala.inline
      def setDimension4(value: String): Self = StObject.set(x, "dimension4", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension4Undefined: Self = StObject.set(x, "dimension4", js.undefined)
      
      @scala.inline
      def setDimension5(value: String): Self = StObject.set(x, "dimension5", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension5Undefined: Self = StObject.set(x, "dimension5", js.undefined)
      
      @scala.inline
      def setDimension6(value: String): Self = StObject.set(x, "dimension6", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension6Undefined: Self = StObject.set(x, "dimension6", js.undefined)
      
      @scala.inline
      def setDimension7(value: String): Self = StObject.set(x, "dimension7", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension7Undefined: Self = StObject.set(x, "dimension7", js.undefined)
      
      @scala.inline
      def setDimension8(value: String): Self = StObject.set(x, "dimension8", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension8Undefined: Self = StObject.set(x, "dimension8", js.undefined)
      
      @scala.inline
      def setDimension9(value: String): Self = StObject.set(x, "dimension9", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimension9Undefined: Self = StObject.set(x, "dimension9", js.undefined)
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setMetric1(value: Double): Self = StObject.set(x, "metric1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric10(value: Double): Self = StObject.set(x, "metric10", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric10Undefined: Self = StObject.set(x, "metric10", js.undefined)
      
      @scala.inline
      def setMetric11(value: Double): Self = StObject.set(x, "metric11", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric11Undefined: Self = StObject.set(x, "metric11", js.undefined)
      
      @scala.inline
      def setMetric12(value: Double): Self = StObject.set(x, "metric12", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric12Undefined: Self = StObject.set(x, "metric12", js.undefined)
      
      @scala.inline
      def setMetric13(value: Double): Self = StObject.set(x, "metric13", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric13Undefined: Self = StObject.set(x, "metric13", js.undefined)
      
      @scala.inline
      def setMetric14(value: Double): Self = StObject.set(x, "metric14", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric14Undefined: Self = StObject.set(x, "metric14", js.undefined)
      
      @scala.inline
      def setMetric15(value: Double): Self = StObject.set(x, "metric15", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric15Undefined: Self = StObject.set(x, "metric15", js.undefined)
      
      @scala.inline
      def setMetric16(value: Double): Self = StObject.set(x, "metric16", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric16Undefined: Self = StObject.set(x, "metric16", js.undefined)
      
      @scala.inline
      def setMetric17(value: Double): Self = StObject.set(x, "metric17", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric17Undefined: Self = StObject.set(x, "metric17", js.undefined)
      
      @scala.inline
      def setMetric18(value: Double): Self = StObject.set(x, "metric18", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric18Undefined: Self = StObject.set(x, "metric18", js.undefined)
      
      @scala.inline
      def setMetric19(value: Double): Self = StObject.set(x, "metric19", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric19Undefined: Self = StObject.set(x, "metric19", js.undefined)
      
      @scala.inline
      def setMetric1Undefined: Self = StObject.set(x, "metric1", js.undefined)
      
      @scala.inline
      def setMetric2(value: Double): Self = StObject.set(x, "metric2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric20(value: Double): Self = StObject.set(x, "metric20", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric20Undefined: Self = StObject.set(x, "metric20", js.undefined)
      
      @scala.inline
      def setMetric2Undefined: Self = StObject.set(x, "metric2", js.undefined)
      
      @scala.inline
      def setMetric3(value: Double): Self = StObject.set(x, "metric3", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric3Undefined: Self = StObject.set(x, "metric3", js.undefined)
      
      @scala.inline
      def setMetric4(value: Double): Self = StObject.set(x, "metric4", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric4Undefined: Self = StObject.set(x, "metric4", js.undefined)
      
      @scala.inline
      def setMetric5(value: Double): Self = StObject.set(x, "metric5", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric5Undefined: Self = StObject.set(x, "metric5", js.undefined)
      
      @scala.inline
      def setMetric6(value: Double): Self = StObject.set(x, "metric6", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric6Undefined: Self = StObject.set(x, "metric6", js.undefined)
      
      @scala.inline
      def setMetric7(value: Double): Self = StObject.set(x, "metric7", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric7Undefined: Self = StObject.set(x, "metric7", js.undefined)
      
      @scala.inline
      def setMetric8(value: Double): Self = StObject.set(x, "metric8", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric8Undefined: Self = StObject.set(x, "metric8", js.undefined)
      
      @scala.inline
      def setMetric9(value: Double): Self = StObject.set(x, "metric9", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric9Undefined: Self = StObject.set(x, "metric9", js.undefined)
      
      @scala.inline
      def setNonInteraction(value: Boolean): Self = StObject.set(x, "nonInteraction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNonInteractionUndefined: Self = StObject.set(x, "nonInteraction", js.undefined)
      
      @scala.inline
      def setTransport(value: beacon | xhr | image): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransportUndefined: Self = StObject.set(x, "transport", js.undefined)
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type FieldsObject = StringDictionary[js.Any]
  
  @js.native
  trait GaOptions extends StObject {
    
    var allowAnchor: js.UndefOr[Boolean] = js.native
    
    var allowLinker: js.UndefOr[Boolean] = js.native
    
    var alwaysSendReferrer: js.UndefOr[Boolean] = js.native
    
    var clientId: js.UndefOr[String] = js.native
    
    var cookieDomain: js.UndefOr[String] = js.native
    
    var cookieExpires: js.UndefOr[Double] = js.native
    
    var cookieFlags: js.UndefOr[String] = js.native
    
    var cookieName: js.UndefOr[String] = js.native
    
    var cookieUpdate: js.UndefOr[Boolean] = js.native
    
    var legacyCookieDomain: js.UndefOr[String] = js.native
    
    var legacyHistoryImport: js.UndefOr[Boolean] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var sampleRate: js.UndefOr[Double] = js.native
    
    var siteSpeedSampleRate: js.UndefOr[Double] = js.native
    
    var storage: js.UndefOr[String] = js.native
    
    var storeGac: js.UndefOr[Boolean] = js.native
    
    var userId: js.UndefOr[String] = js.native
  }
  object GaOptions {
    
    @scala.inline
    def apply(): GaOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GaOptions]
    }
    
    @scala.inline
    implicit class GaOptionsMutableBuilder[Self <: GaOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowAnchor(value: Boolean): Self = StObject.set(x, "allowAnchor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowAnchorUndefined: Self = StObject.set(x, "allowAnchor", js.undefined)
      
      @scala.inline
      def setAllowLinker(value: Boolean): Self = StObject.set(x, "allowLinker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowLinkerUndefined: Self = StObject.set(x, "allowLinker", js.undefined)
      
      @scala.inline
      def setAlwaysSendReferrer(value: Boolean): Self = StObject.set(x, "alwaysSendReferrer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlwaysSendReferrerUndefined: Self = StObject.set(x, "alwaysSendReferrer", js.undefined)
      
      @scala.inline
      def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
      
      @scala.inline
      def setCookieDomain(value: String): Self = StObject.set(x, "cookieDomain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCookieDomainUndefined: Self = StObject.set(x, "cookieDomain", js.undefined)
      
      @scala.inline
      def setCookieExpires(value: Double): Self = StObject.set(x, "cookieExpires", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCookieExpiresUndefined: Self = StObject.set(x, "cookieExpires", js.undefined)
      
      @scala.inline
      def setCookieFlags(value: String): Self = StObject.set(x, "cookieFlags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCookieFlagsUndefined: Self = StObject.set(x, "cookieFlags", js.undefined)
      
      @scala.inline
      def setCookieName(value: String): Self = StObject.set(x, "cookieName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCookieNameUndefined: Self = StObject.set(x, "cookieName", js.undefined)
      
      @scala.inline
      def setCookieUpdate(value: Boolean): Self = StObject.set(x, "cookieUpdate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCookieUpdateUndefined: Self = StObject.set(x, "cookieUpdate", js.undefined)
      
      @scala.inline
      def setLegacyCookieDomain(value: String): Self = StObject.set(x, "legacyCookieDomain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLegacyCookieDomainUndefined: Self = StObject.set(x, "legacyCookieDomain", js.undefined)
      
      @scala.inline
      def setLegacyHistoryImport(value: Boolean): Self = StObject.set(x, "legacyHistoryImport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLegacyHistoryImportUndefined: Self = StObject.set(x, "legacyHistoryImport", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setSampleRate(value: Double): Self = StObject.set(x, "sampleRate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSampleRateUndefined: Self = StObject.set(x, "sampleRate", js.undefined)
      
      @scala.inline
      def setSiteSpeedSampleRate(value: Double): Self = StObject.set(x, "siteSpeedSampleRate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSiteSpeedSampleRateUndefined: Self = StObject.set(x, "siteSpeedSampleRate", js.undefined)
      
      @scala.inline
      def setStorage(value: String): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStorageUndefined: Self = StObject.set(x, "storage", js.undefined)
      
      @scala.inline
      def setStoreGac(value: Boolean): Self = StObject.set(x, "storeGac", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStoreGacUndefined: Self = StObject.set(x, "storeGac", js.undefined)
      
      @scala.inline
      def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
    }
  }
  
  @js.native
  trait InitializeOptions extends StObject {
    
    var alwaysSendToDefaultTracker: js.UndefOr[Boolean] = js.native
    
    var debug: js.UndefOr[Boolean] = js.native
    
    var gaAddress: js.UndefOr[String] = js.native
    
    var gaOptions: js.UndefOr[GaOptions] = js.native
    
    /** Optional. Defaults to `true`. Enables redacting a email as the string that in "Event Category" and "Event Action". */
    var redactEmail: js.UndefOr[Boolean] = js.native
    
    var standardImplementation: js.UndefOr[Boolean] = js.native
    
    var testMode: js.UndefOr[Boolean] = js.native
    
    var titleCase: js.UndefOr[Boolean] = js.native
    
    var useExistingGa: js.UndefOr[Boolean] = js.native
  }
  object InitializeOptions {
    
    @scala.inline
    def apply(): InitializeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InitializeOptions]
    }
    
    @scala.inline
    implicit class InitializeOptionsMutableBuilder[Self <: InitializeOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlwaysSendToDefaultTracker(value: Boolean): Self = StObject.set(x, "alwaysSendToDefaultTracker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlwaysSendToDefaultTrackerUndefined: Self = StObject.set(x, "alwaysSendToDefaultTracker", js.undefined)
      
      @scala.inline
      def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setGaAddress(value: String): Self = StObject.set(x, "gaAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGaAddressUndefined: Self = StObject.set(x, "gaAddress", js.undefined)
      
      @scala.inline
      def setGaOptions(value: GaOptions): Self = StObject.set(x, "gaOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGaOptionsUndefined: Self = StObject.set(x, "gaOptions", js.undefined)
      
      @scala.inline
      def setRedactEmail(value: Boolean): Self = StObject.set(x, "redactEmail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedactEmailUndefined: Self = StObject.set(x, "redactEmail", js.undefined)
      
      @scala.inline
      def setStandardImplementation(value: Boolean): Self = StObject.set(x, "standardImplementation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStandardImplementationUndefined: Self = StObject.set(x, "standardImplementation", js.undefined)
      
      @scala.inline
      def setTestMode(value: Boolean): Self = StObject.set(x, "testMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTestModeUndefined: Self = StObject.set(x, "testMode", js.undefined)
      
      @scala.inline
      def setTitleCase(value: Boolean): Self = StObject.set(x, "titleCase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleCaseUndefined: Self = StObject.set(x, "titleCase", js.undefined)
      
      @scala.inline
      def setUseExistingGa(value: Boolean): Self = StObject.set(x, "useExistingGa", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseExistingGaUndefined: Self = StObject.set(x, "useExistingGa", js.undefined)
    }
  }
  
  @js.native
  trait OutboundLinkArgs extends StObject {
    
    var label: String = js.native
  }
  object OutboundLinkArgs {
    
    @scala.inline
    def apply(label: String): OutboundLinkArgs = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[OutboundLinkArgs]
    }
    
    @scala.inline
    implicit class OutboundLinkArgsMutableBuilder[Self <: OutboundLinkArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait OutboundLinkProps extends StObject {
    
    var eventLabel: String = js.native
    
    var onClick: js.UndefOr[js.Function] = js.native
    
    var target: js.UndefOr[String] = js.native
    
    var to: String = js.native
    
    var trackerNames: js.UndefOr[TrackerNames] = js.native
  }
  object OutboundLinkProps {
    
    @scala.inline
    def apply(eventLabel: String, to: String): OutboundLinkProps = {
      val __obj = js.Dynamic.literal(eventLabel = eventLabel.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[OutboundLinkProps]
    }
    
    @scala.inline
    implicit class OutboundLinkPropsMutableBuilder[Self <: OutboundLinkProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEventLabel(value: String): Self = StObject.set(x, "eventLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnClick(value: js.Function): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrackerNames(value: TrackerNames): Self = StObject.set(x, "trackerNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrackerNamesUndefined: Self = StObject.set(x, "trackerNames", js.undefined)
      
      @scala.inline
      def setTrackerNamesVarargs(value: String*): Self = StObject.set(x, "trackerNames", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Plugin_ extends StObject {
    
    def execute(pluginName: String, action: String, actionTypeOrPayload: String): Unit = js.native
    def execute(pluginName: String, action: String, actionTypeOrPayload: String, payload: js.Any): Unit = js.native
    def execute(pluginName: String, action: String, actionTypeOrPayload: js.Any): Unit = js.native
    def execute(pluginName: String, action: String, actionTypeOrPayload: js.Any, payload: js.Any): Unit = js.native
    
    def require(name: String): Unit = js.native
    def require(name: String, options: js.UndefOr[scala.Nothing], trackerName: String): Unit = js.native
    def require(name: String, options: js.Any): Unit = js.native
    def require(name: String, options: js.Any, trackerName: String): Unit = js.native
  }
  
  @js.native
  trait TestModeAPI_ extends StObject {
    
    var calls: js.Array[js.Array[_]] = js.native
    
    def ga(args: js.Any*): js.Any = js.native
    
    var resetCalls: js.Function = js.native
  }
  object TestModeAPI_ {
    
    @scala.inline
    def apply(calls: js.Array[js.Array[_]], ga: /* repeated */ js.Any => js.Any, resetCalls: js.Function): TestModeAPI_ = {
      val __obj = js.Dynamic.literal(calls = calls.asInstanceOf[js.Any], ga = js.Any.fromFunction1(ga), resetCalls = resetCalls.asInstanceOf[js.Any])
      __obj.asInstanceOf[TestModeAPI_]
    }
    
    @scala.inline
    implicit class TestModeAPI_MutableBuilder[Self <: TestModeAPI_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCalls(value: js.Array[js.Array[_]]): Self = StObject.set(x, "calls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCallsVarargs(value: js.Array[js.Any]*): Self = StObject.set(x, "calls", js.Array(value :_*))
      
      @scala.inline
      def setGa(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "ga", js.Any.fromFunction1(value))
      
      @scala.inline
      def setResetCalls(value: js.Function): Self = StObject.set(x, "resetCalls", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TimingArgs extends StObject {
    
    var category: String = js.native
    
    var label: js.UndefOr[String] = js.native
    
    var value: Double = js.native
    
    var variable: String = js.native
  }
  object TimingArgs {
    
    @scala.inline
    def apply(category: String, value: Double, variable: String): TimingArgs = {
      val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], variable = variable.asInstanceOf[js.Any])
      __obj.asInstanceOf[TimingArgs]
    }
    
    @scala.inline
    implicit class TimingArgsMutableBuilder[Self <: TimingArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVariable(value: String): Self = StObject.set(x, "variable", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {  trackingId :string} & react-ga.react-ga.InitializeOptions */
  @js.native
  trait Tracker extends StObject {
    
    var alwaysSendToDefaultTracker: js.UndefOr[Boolean] = js.native
    
    var debug: js.UndefOr[Boolean] = js.native
    
    var gaAddress: js.UndefOr[String] = js.native
    
    var gaOptions: js.UndefOr[GaOptions] = js.native
    
    /** Optional. Defaults to `true`. Enables redacting a email as the string that in "Event Category" and "Event Action". */
    var redactEmail: js.UndefOr[Boolean] = js.native
    
    var standardImplementation: js.UndefOr[Boolean] = js.native
    
    var testMode: js.UndefOr[Boolean] = js.native
    
    var titleCase: js.UndefOr[Boolean] = js.native
    
    var trackingId: String = js.native
    
    var useExistingGa: js.UndefOr[Boolean] = js.native
  }
  object Tracker {
    
    @scala.inline
    def apply(trackingId: String): Tracker = {
      val __obj = js.Dynamic.literal(trackingId = trackingId.asInstanceOf[js.Any])
      __obj.asInstanceOf[Tracker]
    }
    
    @scala.inline
    implicit class TrackerMutableBuilder[Self <: Tracker] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlwaysSendToDefaultTracker(value: Boolean): Self = StObject.set(x, "alwaysSendToDefaultTracker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlwaysSendToDefaultTrackerUndefined: Self = StObject.set(x, "alwaysSendToDefaultTracker", js.undefined)
      
      @scala.inline
      def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setGaAddress(value: String): Self = StObject.set(x, "gaAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGaAddressUndefined: Self = StObject.set(x, "gaAddress", js.undefined)
      
      @scala.inline
      def setGaOptions(value: GaOptions): Self = StObject.set(x, "gaOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGaOptionsUndefined: Self = StObject.set(x, "gaOptions", js.undefined)
      
      @scala.inline
      def setRedactEmail(value: Boolean): Self = StObject.set(x, "redactEmail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedactEmailUndefined: Self = StObject.set(x, "redactEmail", js.undefined)
      
      @scala.inline
      def setStandardImplementation(value: Boolean): Self = StObject.set(x, "standardImplementation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStandardImplementationUndefined: Self = StObject.set(x, "standardImplementation", js.undefined)
      
      @scala.inline
      def setTestMode(value: Boolean): Self = StObject.set(x, "testMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTestModeUndefined: Self = StObject.set(x, "testMode", js.undefined)
      
      @scala.inline
      def setTitleCase(value: Boolean): Self = StObject.set(x, "titleCase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleCaseUndefined: Self = StObject.set(x, "titleCase", js.undefined)
      
      @scala.inline
      def setTrackingId(value: String): Self = StObject.set(x, "trackingId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseExistingGa(value: Boolean): Self = StObject.set(x, "useExistingGa", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseExistingGaUndefined: Self = StObject.set(x, "useExistingGa", js.undefined)
    }
  }
  
  type TrackerNames = js.Array[String]
}
