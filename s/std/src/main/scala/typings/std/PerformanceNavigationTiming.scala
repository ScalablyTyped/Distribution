package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides methods and properties to store and retrieve metrics regarding the browser's document navigation events. For example, this interface can be used to determine how much time it takes to load or unload a document. */
@js.native
trait PerformanceNavigationTiming extends PerformanceResourceTiming {
  val domComplete: Double = js.native
  val domContentLoadedEventEnd: Double = js.native
  val domContentLoadedEventStart: Double = js.native
  val domInteractive: Double = js.native
  val loadEventEnd: Double = js.native
  val loadEventStart: Double = js.native
  val redirectCount: Double = js.native
  val `type`: NavigationType = js.native
  val unloadEventEnd: Double = js.native
  val unloadEventStart: Double = js.native
}

object PerformanceNavigationTiming {
  @scala.inline
  def apply(
    connectEnd: Double,
    connectStart: Double,
    decodedBodySize: Double,
    domComplete: Double,
    domContentLoadedEventEnd: Double,
    domContentLoadedEventStart: Double,
    domInteractive: Double,
    domainLookupEnd: Double,
    domainLookupStart: Double,
    duration: Double,
    encodedBodySize: Double,
    entryType: java.lang.String,
    fetchStart: Double,
    initiatorType: java.lang.String,
    loadEventEnd: Double,
    loadEventStart: Double,
    name: java.lang.String,
    nextHopProtocol: java.lang.String,
    redirectCount: Double,
    redirectEnd: Double,
    redirectStart: Double,
    requestStart: Double,
    responseEnd: Double,
    responseStart: Double,
    secureConnectionStart: Double,
    startTime: Double,
    toJSON: () => js.Any,
    transferSize: Double,
    `type`: NavigationType,
    unloadEventEnd: Double,
    unloadEventStart: Double,
    workerStart: Double
  ): PerformanceNavigationTiming = {
    val __obj = js.Dynamic.literal(connectEnd = connectEnd.asInstanceOf[js.Any], connectStart = connectStart.asInstanceOf[js.Any], decodedBodySize = decodedBodySize.asInstanceOf[js.Any], domComplete = domComplete.asInstanceOf[js.Any], domContentLoadedEventEnd = domContentLoadedEventEnd.asInstanceOf[js.Any], domContentLoadedEventStart = domContentLoadedEventStart.asInstanceOf[js.Any], domInteractive = domInteractive.asInstanceOf[js.Any], domainLookupEnd = domainLookupEnd.asInstanceOf[js.Any], domainLookupStart = domainLookupStart.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], encodedBodySize = encodedBodySize.asInstanceOf[js.Any], entryType = entryType.asInstanceOf[js.Any], fetchStart = fetchStart.asInstanceOf[js.Any], initiatorType = initiatorType.asInstanceOf[js.Any], loadEventEnd = loadEventEnd.asInstanceOf[js.Any], loadEventStart = loadEventStart.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nextHopProtocol = nextHopProtocol.asInstanceOf[js.Any], redirectCount = redirectCount.asInstanceOf[js.Any], redirectEnd = redirectEnd.asInstanceOf[js.Any], redirectStart = redirectStart.asInstanceOf[js.Any], requestStart = requestStart.asInstanceOf[js.Any], responseEnd = responseEnd.asInstanceOf[js.Any], responseStart = responseStart.asInstanceOf[js.Any], secureConnectionStart = secureConnectionStart.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), transferSize = transferSize.asInstanceOf[js.Any], unloadEventEnd = unloadEventEnd.asInstanceOf[js.Any], unloadEventStart = unloadEventStart.asInstanceOf[js.Any], workerStart = workerStart.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerformanceNavigationTiming]
  }
  @scala.inline
  implicit class PerformanceNavigationTimingOps[Self <: PerformanceNavigationTiming] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDomComplete(value: Double): Self = this.set("domComplete", value.asInstanceOf[js.Any])
    @scala.inline
    def setDomContentLoadedEventEnd(value: Double): Self = this.set("domContentLoadedEventEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def setDomContentLoadedEventStart(value: Double): Self = this.set("domContentLoadedEventStart", value.asInstanceOf[js.Any])
    @scala.inline
    def setDomInteractive(value: Double): Self = this.set("domInteractive", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoadEventEnd(value: Double): Self = this.set("loadEventEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoadEventStart(value: Double): Self = this.set("loadEventStart", value.asInstanceOf[js.Any])
    @scala.inline
    def setRedirectCount(value: Double): Self = this.set("redirectCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: NavigationType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnloadEventEnd(value: Double): Self = this.set("unloadEventEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnloadEventStart(value: Double): Self = this.set("unloadEventStart", value.asInstanceOf[js.Any])
  }
  
}

