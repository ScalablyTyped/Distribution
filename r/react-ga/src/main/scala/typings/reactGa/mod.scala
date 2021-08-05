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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-ga", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-ga", "OutboundLink")
  @js.native
  class OutboundLink_ protected ()
    extends Component[OutboundLinkProps & HTMLProps[HTMLAnchorElement], ComponentState, js.Any] {
    def this(props: OutboundLinkProps & HTMLProps[HTMLAnchorElement]) = this()
    def this(props: OutboundLinkProps & HTMLProps[HTMLAnchorElement], context: js.Any) = this()
  }
  
  @JSImport("react-ga", "OutboundLink")
  @js.native
  val OutboundLink_ : ComponentClass[OutboundLinkProps & HTMLProps[HTMLAnchorElement], ComponentState] = js.native
  
  inline def addTrackers(trackers: js.Array[Tracker]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addTrackers")(trackers.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def addTrackers(trackingCode: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addTrackers")(trackingCode.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def event(args: EventArgs): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("event")(args.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def event(args: EventArgs, trackerNames: TrackerNames): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("event")(args.asInstanceOf[js.Any], trackerNames.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def exception(fieldsObject: FieldsObject): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("exception")(fieldsObject.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def exception(fieldsObject: FieldsObject, trackerNames: TrackerNames): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("exception")(fieldsObject.asInstanceOf[js.Any], trackerNames.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def ga(): js.Function1[/* repeated */ js.Any, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("ga")().asInstanceOf[js.Function1[/* repeated */ js.Any, Unit]]
  inline def ga(args: js.Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ga")(args.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def initialize(trackers: js.Array[Tracker]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(trackers.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def initialize(trackers: js.Array[Tracker], options: InitializeOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(trackers.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def initialize(trackingCode: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(trackingCode.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def initialize(trackingCode: String, options: InitializeOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(trackingCode.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def modalview(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("modalview")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def modalview(name: String, trackerNames: TrackerNames): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("modalview")(name.asInstanceOf[js.Any], trackerNames.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def outboundLink(args: OutboundLinkArgs, hitCallback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("outboundLink")(args.asInstanceOf[js.Any], hitCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def outboundLink(args: OutboundLinkArgs, hitCallback: js.Function0[Unit], trackerNames: TrackerNames): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("outboundLink")(args.asInstanceOf[js.Any], hitCallback.asInstanceOf[js.Any], trackerNames.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def pageview(path: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("pageview")(path.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def pageview(path: String, trackerNames: Unit, title: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("pageview")(path.asInstanceOf[js.Any], trackerNames.asInstanceOf[js.Any], title.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def pageview(path: String, trackerNames: TrackerNames): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("pageview")(path.asInstanceOf[js.Any], trackerNames.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def pageview(path: String, trackerNames: TrackerNames, title: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("pageview")(path.asInstanceOf[js.Any], trackerNames.asInstanceOf[js.Any], title.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("react-ga", "plugin")
  @js.native
  val plugin: Plugin_ = js.native
  
  inline def resetCalls(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetCalls")().asInstanceOf[Unit]
  
  inline def send(fieldsObject: FieldsObject): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("send")(fieldsObject.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def send(fieldsObject: FieldsObject, trackerNames: TrackerNames): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("send")(fieldsObject.asInstanceOf[js.Any], trackerNames.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def set(fieldsObject: FieldsObject): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("set")(fieldsObject.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def set(fieldsObject: FieldsObject, trackerNames: TrackerNames): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(fieldsObject.asInstanceOf[js.Any], trackerNames.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("react-ga", "testModeAPI")
  @js.native
  val testModeAPI: TestModeAPI_ = js.native
  
  inline def timing(args: TimingArgs): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("timing")(args.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def timing(args: TimingArgs, trackerNames: TrackerNames): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("timing")(args.asInstanceOf[js.Any], trackerNames.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait EventArgs extends StObject {
    
    /** The type of interaction (e.g. 'play') */
    var action: String
    
    /** Typically the object that was interacted with (e.g. 'Video') */
    var category: String
    
    /** Custom dimensions */
    var dimension1: js.UndefOr[String] = js.undefined
    
    var dimension10: js.UndefOr[String] = js.undefined
    
    var dimension11: js.UndefOr[String] = js.undefined
    
    var dimension12: js.UndefOr[String] = js.undefined
    
    var dimension13: js.UndefOr[String] = js.undefined
    
    var dimension14: js.UndefOr[String] = js.undefined
    
    var dimension15: js.UndefOr[String] = js.undefined
    
    var dimension16: js.UndefOr[String] = js.undefined
    
    var dimension17: js.UndefOr[String] = js.undefined
    
    var dimension18: js.UndefOr[String] = js.undefined
    
    var dimension19: js.UndefOr[String] = js.undefined
    
    var dimension2: js.UndefOr[String] = js.undefined
    
    var dimension20: js.UndefOr[String] = js.undefined
    
    var dimension3: js.UndefOr[String] = js.undefined
    
    var dimension4: js.UndefOr[String] = js.undefined
    
    var dimension5: js.UndefOr[String] = js.undefined
    
    var dimension6: js.UndefOr[String] = js.undefined
    
    var dimension7: js.UndefOr[String] = js.undefined
    
    var dimension8: js.UndefOr[String] = js.undefined
    
    var dimension9: js.UndefOr[String] = js.undefined
    
    /** Useful for categorizing events (e.g. 'Fall Campaign') */
    var label: js.UndefOr[String] = js.undefined
    
    /** Custom metrics */
    var metric1: js.UndefOr[Double] = js.undefined
    
    var metric10: js.UndefOr[Double] = js.undefined
    
    var metric11: js.UndefOr[Double] = js.undefined
    
    var metric12: js.UndefOr[Double] = js.undefined
    
    var metric13: js.UndefOr[Double] = js.undefined
    
    var metric14: js.UndefOr[Double] = js.undefined
    
    var metric15: js.UndefOr[Double] = js.undefined
    
    var metric16: js.UndefOr[Double] = js.undefined
    
    var metric17: js.UndefOr[Double] = js.undefined
    
    var metric18: js.UndefOr[Double] = js.undefined
    
    var metric19: js.UndefOr[Double] = js.undefined
    
    var metric2: js.UndefOr[Double] = js.undefined
    
    var metric20: js.UndefOr[Double] = js.undefined
    
    var metric3: js.UndefOr[Double] = js.undefined
    
    var metric4: js.UndefOr[Double] = js.undefined
    
    var metric5: js.UndefOr[Double] = js.undefined
    
    var metric6: js.UndefOr[Double] = js.undefined
    
    var metric7: js.UndefOr[Double] = js.undefined
    
    var metric8: js.UndefOr[Double] = js.undefined
    
    var metric9: js.UndefOr[Double] = js.undefined
    
    /** Specifies that a hit be considered non-interactive. */
    var nonInteraction: js.UndefOr[Boolean] = js.undefined
    
    /**
      * This specifies the transport mechanism with which hits will be sent.
      * The options are 'beacon', 'xhr', or 'image'. By default, analytics.js
      * will try to figure out the best method based on the hit size and browser
      * capabilities. If you specify 'beacon' and the user's browser does not support
      * the `navigator.sendBeacon` method, it will fall back to 'image' or 'xhr'
      * depending on hit size.
      */
    var transport: js.UndefOr[beacon | xhr | image] = js.undefined
    
    /** A numeric value associated with the event (e.g. 42) */
    var value: js.UndefOr[Double] = js.undefined
  }
  object EventArgs {
    
    inline def apply(action: String, category: String): EventArgs = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], category = category.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventArgs]
    }
    
    extension [Self <: EventArgs](x: Self) {
      
      inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
      
      inline def setDimension1(value: String): Self = StObject.set(x, "dimension1", value.asInstanceOf[js.Any])
      
      inline def setDimension10(value: String): Self = StObject.set(x, "dimension10", value.asInstanceOf[js.Any])
      
      inline def setDimension10Undefined: Self = StObject.set(x, "dimension10", js.undefined)
      
      inline def setDimension11(value: String): Self = StObject.set(x, "dimension11", value.asInstanceOf[js.Any])
      
      inline def setDimension11Undefined: Self = StObject.set(x, "dimension11", js.undefined)
      
      inline def setDimension12(value: String): Self = StObject.set(x, "dimension12", value.asInstanceOf[js.Any])
      
      inline def setDimension12Undefined: Self = StObject.set(x, "dimension12", js.undefined)
      
      inline def setDimension13(value: String): Self = StObject.set(x, "dimension13", value.asInstanceOf[js.Any])
      
      inline def setDimension13Undefined: Self = StObject.set(x, "dimension13", js.undefined)
      
      inline def setDimension14(value: String): Self = StObject.set(x, "dimension14", value.asInstanceOf[js.Any])
      
      inline def setDimension14Undefined: Self = StObject.set(x, "dimension14", js.undefined)
      
      inline def setDimension15(value: String): Self = StObject.set(x, "dimension15", value.asInstanceOf[js.Any])
      
      inline def setDimension15Undefined: Self = StObject.set(x, "dimension15", js.undefined)
      
      inline def setDimension16(value: String): Self = StObject.set(x, "dimension16", value.asInstanceOf[js.Any])
      
      inline def setDimension16Undefined: Self = StObject.set(x, "dimension16", js.undefined)
      
      inline def setDimension17(value: String): Self = StObject.set(x, "dimension17", value.asInstanceOf[js.Any])
      
      inline def setDimension17Undefined: Self = StObject.set(x, "dimension17", js.undefined)
      
      inline def setDimension18(value: String): Self = StObject.set(x, "dimension18", value.asInstanceOf[js.Any])
      
      inline def setDimension18Undefined: Self = StObject.set(x, "dimension18", js.undefined)
      
      inline def setDimension19(value: String): Self = StObject.set(x, "dimension19", value.asInstanceOf[js.Any])
      
      inline def setDimension19Undefined: Self = StObject.set(x, "dimension19", js.undefined)
      
      inline def setDimension1Undefined: Self = StObject.set(x, "dimension1", js.undefined)
      
      inline def setDimension2(value: String): Self = StObject.set(x, "dimension2", value.asInstanceOf[js.Any])
      
      inline def setDimension20(value: String): Self = StObject.set(x, "dimension20", value.asInstanceOf[js.Any])
      
      inline def setDimension20Undefined: Self = StObject.set(x, "dimension20", js.undefined)
      
      inline def setDimension2Undefined: Self = StObject.set(x, "dimension2", js.undefined)
      
      inline def setDimension3(value: String): Self = StObject.set(x, "dimension3", value.asInstanceOf[js.Any])
      
      inline def setDimension3Undefined: Self = StObject.set(x, "dimension3", js.undefined)
      
      inline def setDimension4(value: String): Self = StObject.set(x, "dimension4", value.asInstanceOf[js.Any])
      
      inline def setDimension4Undefined: Self = StObject.set(x, "dimension4", js.undefined)
      
      inline def setDimension5(value: String): Self = StObject.set(x, "dimension5", value.asInstanceOf[js.Any])
      
      inline def setDimension5Undefined: Self = StObject.set(x, "dimension5", js.undefined)
      
      inline def setDimension6(value: String): Self = StObject.set(x, "dimension6", value.asInstanceOf[js.Any])
      
      inline def setDimension6Undefined: Self = StObject.set(x, "dimension6", js.undefined)
      
      inline def setDimension7(value: String): Self = StObject.set(x, "dimension7", value.asInstanceOf[js.Any])
      
      inline def setDimension7Undefined: Self = StObject.set(x, "dimension7", js.undefined)
      
      inline def setDimension8(value: String): Self = StObject.set(x, "dimension8", value.asInstanceOf[js.Any])
      
      inline def setDimension8Undefined: Self = StObject.set(x, "dimension8", js.undefined)
      
      inline def setDimension9(value: String): Self = StObject.set(x, "dimension9", value.asInstanceOf[js.Any])
      
      inline def setDimension9Undefined: Self = StObject.set(x, "dimension9", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setMetric1(value: Double): Self = StObject.set(x, "metric1", value.asInstanceOf[js.Any])
      
      inline def setMetric10(value: Double): Self = StObject.set(x, "metric10", value.asInstanceOf[js.Any])
      
      inline def setMetric10Undefined: Self = StObject.set(x, "metric10", js.undefined)
      
      inline def setMetric11(value: Double): Self = StObject.set(x, "metric11", value.asInstanceOf[js.Any])
      
      inline def setMetric11Undefined: Self = StObject.set(x, "metric11", js.undefined)
      
      inline def setMetric12(value: Double): Self = StObject.set(x, "metric12", value.asInstanceOf[js.Any])
      
      inline def setMetric12Undefined: Self = StObject.set(x, "metric12", js.undefined)
      
      inline def setMetric13(value: Double): Self = StObject.set(x, "metric13", value.asInstanceOf[js.Any])
      
      inline def setMetric13Undefined: Self = StObject.set(x, "metric13", js.undefined)
      
      inline def setMetric14(value: Double): Self = StObject.set(x, "metric14", value.asInstanceOf[js.Any])
      
      inline def setMetric14Undefined: Self = StObject.set(x, "metric14", js.undefined)
      
      inline def setMetric15(value: Double): Self = StObject.set(x, "metric15", value.asInstanceOf[js.Any])
      
      inline def setMetric15Undefined: Self = StObject.set(x, "metric15", js.undefined)
      
      inline def setMetric16(value: Double): Self = StObject.set(x, "metric16", value.asInstanceOf[js.Any])
      
      inline def setMetric16Undefined: Self = StObject.set(x, "metric16", js.undefined)
      
      inline def setMetric17(value: Double): Self = StObject.set(x, "metric17", value.asInstanceOf[js.Any])
      
      inline def setMetric17Undefined: Self = StObject.set(x, "metric17", js.undefined)
      
      inline def setMetric18(value: Double): Self = StObject.set(x, "metric18", value.asInstanceOf[js.Any])
      
      inline def setMetric18Undefined: Self = StObject.set(x, "metric18", js.undefined)
      
      inline def setMetric19(value: Double): Self = StObject.set(x, "metric19", value.asInstanceOf[js.Any])
      
      inline def setMetric19Undefined: Self = StObject.set(x, "metric19", js.undefined)
      
      inline def setMetric1Undefined: Self = StObject.set(x, "metric1", js.undefined)
      
      inline def setMetric2(value: Double): Self = StObject.set(x, "metric2", value.asInstanceOf[js.Any])
      
      inline def setMetric20(value: Double): Self = StObject.set(x, "metric20", value.asInstanceOf[js.Any])
      
      inline def setMetric20Undefined: Self = StObject.set(x, "metric20", js.undefined)
      
      inline def setMetric2Undefined: Self = StObject.set(x, "metric2", js.undefined)
      
      inline def setMetric3(value: Double): Self = StObject.set(x, "metric3", value.asInstanceOf[js.Any])
      
      inline def setMetric3Undefined: Self = StObject.set(x, "metric3", js.undefined)
      
      inline def setMetric4(value: Double): Self = StObject.set(x, "metric4", value.asInstanceOf[js.Any])
      
      inline def setMetric4Undefined: Self = StObject.set(x, "metric4", js.undefined)
      
      inline def setMetric5(value: Double): Self = StObject.set(x, "metric5", value.asInstanceOf[js.Any])
      
      inline def setMetric5Undefined: Self = StObject.set(x, "metric5", js.undefined)
      
      inline def setMetric6(value: Double): Self = StObject.set(x, "metric6", value.asInstanceOf[js.Any])
      
      inline def setMetric6Undefined: Self = StObject.set(x, "metric6", js.undefined)
      
      inline def setMetric7(value: Double): Self = StObject.set(x, "metric7", value.asInstanceOf[js.Any])
      
      inline def setMetric7Undefined: Self = StObject.set(x, "metric7", js.undefined)
      
      inline def setMetric8(value: Double): Self = StObject.set(x, "metric8", value.asInstanceOf[js.Any])
      
      inline def setMetric8Undefined: Self = StObject.set(x, "metric8", js.undefined)
      
      inline def setMetric9(value: Double): Self = StObject.set(x, "metric9", value.asInstanceOf[js.Any])
      
      inline def setMetric9Undefined: Self = StObject.set(x, "metric9", js.undefined)
      
      inline def setNonInteraction(value: Boolean): Self = StObject.set(x, "nonInteraction", value.asInstanceOf[js.Any])
      
      inline def setNonInteractionUndefined: Self = StObject.set(x, "nonInteraction", js.undefined)
      
      inline def setTransport(value: beacon | xhr | image): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
      
      inline def setTransportUndefined: Self = StObject.set(x, "transport", js.undefined)
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type FieldsObject = StringDictionary[js.Any]
  
  trait GaOptions extends StObject {
    
    var allowAnchor: js.UndefOr[Boolean] = js.undefined
    
    var allowLinker: js.UndefOr[Boolean] = js.undefined
    
    var alwaysSendReferrer: js.UndefOr[Boolean] = js.undefined
    
    var clientId: js.UndefOr[String] = js.undefined
    
    var cookieDomain: js.UndefOr[String] = js.undefined
    
    var cookieExpires: js.UndefOr[Double] = js.undefined
    
    var cookieFlags: js.UndefOr[String] = js.undefined
    
    var cookieName: js.UndefOr[String] = js.undefined
    
    var cookieUpdate: js.UndefOr[Boolean] = js.undefined
    
    var legacyCookieDomain: js.UndefOr[String] = js.undefined
    
    var legacyHistoryImport: js.UndefOr[Boolean] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var sampleRate: js.UndefOr[Double] = js.undefined
    
    var siteSpeedSampleRate: js.UndefOr[Double] = js.undefined
    
    var storage: js.UndefOr[String] = js.undefined
    
    var storeGac: js.UndefOr[Boolean] = js.undefined
    
    var userId: js.UndefOr[String] = js.undefined
  }
  object GaOptions {
    
    inline def apply(): GaOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GaOptions]
    }
    
    extension [Self <: GaOptions](x: Self) {
      
      inline def setAllowAnchor(value: Boolean): Self = StObject.set(x, "allowAnchor", value.asInstanceOf[js.Any])
      
      inline def setAllowAnchorUndefined: Self = StObject.set(x, "allowAnchor", js.undefined)
      
      inline def setAllowLinker(value: Boolean): Self = StObject.set(x, "allowLinker", value.asInstanceOf[js.Any])
      
      inline def setAllowLinkerUndefined: Self = StObject.set(x, "allowLinker", js.undefined)
      
      inline def setAlwaysSendReferrer(value: Boolean): Self = StObject.set(x, "alwaysSendReferrer", value.asInstanceOf[js.Any])
      
      inline def setAlwaysSendReferrerUndefined: Self = StObject.set(x, "alwaysSendReferrer", js.undefined)
      
      inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      inline def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
      
      inline def setCookieDomain(value: String): Self = StObject.set(x, "cookieDomain", value.asInstanceOf[js.Any])
      
      inline def setCookieDomainUndefined: Self = StObject.set(x, "cookieDomain", js.undefined)
      
      inline def setCookieExpires(value: Double): Self = StObject.set(x, "cookieExpires", value.asInstanceOf[js.Any])
      
      inline def setCookieExpiresUndefined: Self = StObject.set(x, "cookieExpires", js.undefined)
      
      inline def setCookieFlags(value: String): Self = StObject.set(x, "cookieFlags", value.asInstanceOf[js.Any])
      
      inline def setCookieFlagsUndefined: Self = StObject.set(x, "cookieFlags", js.undefined)
      
      inline def setCookieName(value: String): Self = StObject.set(x, "cookieName", value.asInstanceOf[js.Any])
      
      inline def setCookieNameUndefined: Self = StObject.set(x, "cookieName", js.undefined)
      
      inline def setCookieUpdate(value: Boolean): Self = StObject.set(x, "cookieUpdate", value.asInstanceOf[js.Any])
      
      inline def setCookieUpdateUndefined: Self = StObject.set(x, "cookieUpdate", js.undefined)
      
      inline def setLegacyCookieDomain(value: String): Self = StObject.set(x, "legacyCookieDomain", value.asInstanceOf[js.Any])
      
      inline def setLegacyCookieDomainUndefined: Self = StObject.set(x, "legacyCookieDomain", js.undefined)
      
      inline def setLegacyHistoryImport(value: Boolean): Self = StObject.set(x, "legacyHistoryImport", value.asInstanceOf[js.Any])
      
      inline def setLegacyHistoryImportUndefined: Self = StObject.set(x, "legacyHistoryImport", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setSampleRate(value: Double): Self = StObject.set(x, "sampleRate", value.asInstanceOf[js.Any])
      
      inline def setSampleRateUndefined: Self = StObject.set(x, "sampleRate", js.undefined)
      
      inline def setSiteSpeedSampleRate(value: Double): Self = StObject.set(x, "siteSpeedSampleRate", value.asInstanceOf[js.Any])
      
      inline def setSiteSpeedSampleRateUndefined: Self = StObject.set(x, "siteSpeedSampleRate", js.undefined)
      
      inline def setStorage(value: String): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
      
      inline def setStorageUndefined: Self = StObject.set(x, "storage", js.undefined)
      
      inline def setStoreGac(value: Boolean): Self = StObject.set(x, "storeGac", value.asInstanceOf[js.Any])
      
      inline def setStoreGacUndefined: Self = StObject.set(x, "storeGac", js.undefined)
      
      inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
      
      inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
    }
  }
  
  trait InitializeOptions extends StObject {
    
    var alwaysSendToDefaultTracker: js.UndefOr[Boolean] = js.undefined
    
    var debug: js.UndefOr[Boolean] = js.undefined
    
    var gaAddress: js.UndefOr[String] = js.undefined
    
    var gaOptions: js.UndefOr[GaOptions] = js.undefined
    
    /** Optional. Defaults to `true`. Enables redacting a email as the string that in "Event Category" and "Event Action". */
    var redactEmail: js.UndefOr[Boolean] = js.undefined
    
    var standardImplementation: js.UndefOr[Boolean] = js.undefined
    
    var testMode: js.UndefOr[Boolean] = js.undefined
    
    var titleCase: js.UndefOr[Boolean] = js.undefined
    
    var useExistingGa: js.UndefOr[Boolean] = js.undefined
  }
  object InitializeOptions {
    
    inline def apply(): InitializeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InitializeOptions]
    }
    
    extension [Self <: InitializeOptions](x: Self) {
      
      inline def setAlwaysSendToDefaultTracker(value: Boolean): Self = StObject.set(x, "alwaysSendToDefaultTracker", value.asInstanceOf[js.Any])
      
      inline def setAlwaysSendToDefaultTrackerUndefined: Self = StObject.set(x, "alwaysSendToDefaultTracker", js.undefined)
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setGaAddress(value: String): Self = StObject.set(x, "gaAddress", value.asInstanceOf[js.Any])
      
      inline def setGaAddressUndefined: Self = StObject.set(x, "gaAddress", js.undefined)
      
      inline def setGaOptions(value: GaOptions): Self = StObject.set(x, "gaOptions", value.asInstanceOf[js.Any])
      
      inline def setGaOptionsUndefined: Self = StObject.set(x, "gaOptions", js.undefined)
      
      inline def setRedactEmail(value: Boolean): Self = StObject.set(x, "redactEmail", value.asInstanceOf[js.Any])
      
      inline def setRedactEmailUndefined: Self = StObject.set(x, "redactEmail", js.undefined)
      
      inline def setStandardImplementation(value: Boolean): Self = StObject.set(x, "standardImplementation", value.asInstanceOf[js.Any])
      
      inline def setStandardImplementationUndefined: Self = StObject.set(x, "standardImplementation", js.undefined)
      
      inline def setTestMode(value: Boolean): Self = StObject.set(x, "testMode", value.asInstanceOf[js.Any])
      
      inline def setTestModeUndefined: Self = StObject.set(x, "testMode", js.undefined)
      
      inline def setTitleCase(value: Boolean): Self = StObject.set(x, "titleCase", value.asInstanceOf[js.Any])
      
      inline def setTitleCaseUndefined: Self = StObject.set(x, "titleCase", js.undefined)
      
      inline def setUseExistingGa(value: Boolean): Self = StObject.set(x, "useExistingGa", value.asInstanceOf[js.Any])
      
      inline def setUseExistingGaUndefined: Self = StObject.set(x, "useExistingGa", js.undefined)
    }
  }
  
  trait OutboundLinkArgs extends StObject {
    
    var label: String
  }
  object OutboundLinkArgs {
    
    inline def apply(label: String): OutboundLinkArgs = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[OutboundLinkArgs]
    }
    
    extension [Self <: OutboundLinkArgs](x: Self) {
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    }
  }
  
  trait OutboundLinkProps extends StObject {
    
    var eventLabel: String
    
    var onClick: js.UndefOr[js.Function] = js.undefined
    
    var target: js.UndefOr[String] = js.undefined
    
    var to: String
    
    var trackerNames: js.UndefOr[TrackerNames] = js.undefined
  }
  object OutboundLinkProps {
    
    inline def apply(eventLabel: String, to: String): OutboundLinkProps = {
      val __obj = js.Dynamic.literal(eventLabel = eventLabel.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[OutboundLinkProps]
    }
    
    extension [Self <: OutboundLinkProps](x: Self) {
      
      inline def setEventLabel(value: String): Self = StObject.set(x, "eventLabel", value.asInstanceOf[js.Any])
      
      inline def setOnClick(value: js.Function): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setTrackerNames(value: TrackerNames): Self = StObject.set(x, "trackerNames", value.asInstanceOf[js.Any])
      
      inline def setTrackerNamesUndefined: Self = StObject.set(x, "trackerNames", js.undefined)
      
      inline def setTrackerNamesVarargs(value: String*): Self = StObject.set(x, "trackerNames", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Plugin_ extends StObject {
    
    def execute(pluginName: String, action: String, actionTypeOrPayload: String): Unit = js.native
    def execute(pluginName: String, action: String, actionTypeOrPayload: String, payload: js.Any): Unit = js.native
    def execute(pluginName: String, action: String, actionTypeOrPayload: js.Any): Unit = js.native
    def execute(pluginName: String, action: String, actionTypeOrPayload: js.Any, payload: js.Any): Unit = js.native
    
    def require(name: String): Unit = js.native
    def require(name: String, options: js.Any): Unit = js.native
    def require(name: String, options: js.Any, trackerName: String): Unit = js.native
    def require(name: String, options: Unit, trackerName: String): Unit = js.native
  }
  
  trait TestModeAPI_ extends StObject {
    
    var calls: js.Array[js.Array[js.Any]]
    
    def ga(args: js.Any*): js.Any
    
    var resetCalls: js.Function
  }
  object TestModeAPI_ {
    
    inline def apply(calls: js.Array[js.Array[js.Any]], ga: /* repeated */ js.Any => js.Any, resetCalls: js.Function): TestModeAPI_ = {
      val __obj = js.Dynamic.literal(calls = calls.asInstanceOf[js.Any], ga = js.Any.fromFunction1(ga), resetCalls = resetCalls.asInstanceOf[js.Any])
      __obj.asInstanceOf[TestModeAPI_]
    }
    
    extension [Self <: TestModeAPI_](x: Self) {
      
      inline def setCalls(value: js.Array[js.Array[js.Any]]): Self = StObject.set(x, "calls", value.asInstanceOf[js.Any])
      
      inline def setCallsVarargs(value: js.Array[js.Any]*): Self = StObject.set(x, "calls", js.Array(value :_*))
      
      inline def setGa(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "ga", js.Any.fromFunction1(value))
      
      inline def setResetCalls(value: js.Function): Self = StObject.set(x, "resetCalls", value.asInstanceOf[js.Any])
    }
  }
  
  trait TimingArgs extends StObject {
    
    var category: String
    
    var label: js.UndefOr[String] = js.undefined
    
    var value: Double
    
    var variable: String
  }
  object TimingArgs {
    
    inline def apply(category: String, value: Double, variable: String): TimingArgs = {
      val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], variable = variable.asInstanceOf[js.Any])
      __obj.asInstanceOf[TimingArgs]
    }
    
    extension [Self <: TimingArgs](x: Self) {
      
      inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setVariable(value: String): Self = StObject.set(x, "variable", value.asInstanceOf[js.Any])
    }
  }
  
  trait Tracker
    extends StObject
       with InitializeOptions {
    
    var trackingId: String
  }
  object Tracker {
    
    inline def apply(trackingId: String): Tracker = {
      val __obj = js.Dynamic.literal(trackingId = trackingId.asInstanceOf[js.Any])
      __obj.asInstanceOf[Tracker]
    }
    
    extension [Self <: Tracker](x: Self) {
      
      inline def setTrackingId(value: String): Self = StObject.set(x, "trackingId", value.asInstanceOf[js.Any])
    }
  }
  
  type TrackerNames = js.Array[String]
}
