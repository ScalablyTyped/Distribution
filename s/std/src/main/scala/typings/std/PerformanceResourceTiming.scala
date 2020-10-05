package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Enables retrieval and analysis of detailed network timing data regarding the loading of an application's resources. An application can use the timing metrics to determine, for example, the length of time it takes to fetch a specific resource, such as an XMLHttpRequest, <SVG>, image, or script. */
@js.native
trait PerformanceResourceTiming extends PerformanceEntry {
  val connectEnd: Double = js.native
  val connectStart: Double = js.native
  val decodedBodySize: Double = js.native
  val domainLookupEnd: Double = js.native
  val domainLookupStart: Double = js.native
  val encodedBodySize: Double = js.native
  val fetchStart: Double = js.native
  val initiatorType: java.lang.String = js.native
  val nextHopProtocol: java.lang.String = js.native
  val redirectEnd: Double = js.native
  val redirectStart: Double = js.native
  val requestStart: Double = js.native
  val responseEnd: Double = js.native
  val responseStart: Double = js.native
  val secureConnectionStart: Double = js.native
  val transferSize: Double = js.native
  val workerStart: Double = js.native
}

object PerformanceResourceTiming {
  @scala.inline
  def apply(
    connectEnd: Double,
    connectStart: Double,
    decodedBodySize: Double,
    domainLookupEnd: Double,
    domainLookupStart: Double,
    duration: Double,
    encodedBodySize: Double,
    entryType: java.lang.String,
    fetchStart: Double,
    initiatorType: java.lang.String,
    name: java.lang.String,
    nextHopProtocol: java.lang.String,
    redirectEnd: Double,
    redirectStart: Double,
    requestStart: Double,
    responseEnd: Double,
    responseStart: Double,
    secureConnectionStart: Double,
    startTime: Double,
    toJSON: () => js.Any,
    transferSize: Double,
    workerStart: Double
  ): PerformanceResourceTiming = {
    val __obj = js.Dynamic.literal(connectEnd = connectEnd.asInstanceOf[js.Any], connectStart = connectStart.asInstanceOf[js.Any], decodedBodySize = decodedBodySize.asInstanceOf[js.Any], domainLookupEnd = domainLookupEnd.asInstanceOf[js.Any], domainLookupStart = domainLookupStart.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], encodedBodySize = encodedBodySize.asInstanceOf[js.Any], entryType = entryType.asInstanceOf[js.Any], fetchStart = fetchStart.asInstanceOf[js.Any], initiatorType = initiatorType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nextHopProtocol = nextHopProtocol.asInstanceOf[js.Any], redirectEnd = redirectEnd.asInstanceOf[js.Any], redirectStart = redirectStart.asInstanceOf[js.Any], requestStart = requestStart.asInstanceOf[js.Any], responseEnd = responseEnd.asInstanceOf[js.Any], responseStart = responseStart.asInstanceOf[js.Any], secureConnectionStart = secureConnectionStart.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), transferSize = transferSize.asInstanceOf[js.Any], workerStart = workerStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerformanceResourceTiming]
  }
  @scala.inline
  implicit class PerformanceResourceTimingOps[Self <: PerformanceResourceTiming] (val x: Self) extends AnyVal {
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
    def setConnectEnd(value: Double): Self = this.set("connectEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def setConnectStart(value: Double): Self = this.set("connectStart", value.asInstanceOf[js.Any])
    @scala.inline
    def setDecodedBodySize(value: Double): Self = this.set("decodedBodySize", value.asInstanceOf[js.Any])
    @scala.inline
    def setDomainLookupEnd(value: Double): Self = this.set("domainLookupEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def setDomainLookupStart(value: Double): Self = this.set("domainLookupStart", value.asInstanceOf[js.Any])
    @scala.inline
    def setEncodedBodySize(value: Double): Self = this.set("encodedBodySize", value.asInstanceOf[js.Any])
    @scala.inline
    def setFetchStart(value: Double): Self = this.set("fetchStart", value.asInstanceOf[js.Any])
    @scala.inline
    def setInitiatorType(value: java.lang.String): Self = this.set("initiatorType", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextHopProtocol(value: java.lang.String): Self = this.set("nextHopProtocol", value.asInstanceOf[js.Any])
    @scala.inline
    def setRedirectEnd(value: Double): Self = this.set("redirectEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def setRedirectStart(value: Double): Self = this.set("redirectStart", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequestStart(value: Double): Self = this.set("requestStart", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponseEnd(value: Double): Self = this.set("responseEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponseStart(value: Double): Self = this.set("responseStart", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecureConnectionStart(value: Double): Self = this.set("secureConnectionStart", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransferSize(value: Double): Self = this.set("transferSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setWorkerStart(value: Double): Self = this.set("workerStart", value.asInstanceOf[js.Any])
  }
  
}

