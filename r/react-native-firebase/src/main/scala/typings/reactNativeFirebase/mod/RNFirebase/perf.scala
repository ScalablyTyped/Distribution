package typings.reactNativeFirebase.mod.RNFirebase

import typings.reactNativeFirebase.reactNativeFirebaseBooleans.`false`
import typings.reactNativeFirebase.reactNativeFirebaseBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object perf {
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactNativeFirebase.reactNativeFirebaseStrings.CONNECT
    - typings.reactNativeFirebase.reactNativeFirebaseStrings.DELETE
    - typings.reactNativeFirebase.reactNativeFirebaseStrings.GET
    - typings.reactNativeFirebase.reactNativeFirebaseStrings.HEAD
    - typings.reactNativeFirebase.reactNativeFirebaseStrings.OPTIONS
    - typings.reactNativeFirebase.reactNativeFirebaseStrings.PATCH
    - typings.reactNativeFirebase.reactNativeFirebaseStrings.POST
    - typings.reactNativeFirebase.reactNativeFirebaseStrings.PUT
    - typings.reactNativeFirebase.reactNativeFirebaseStrings.TRACE
  */
  trait HttpMethod extends StObject
  object HttpMethod {
    
    inline def CONNECT: typings.reactNativeFirebase.reactNativeFirebaseStrings.CONNECT = "CONNECT".asInstanceOf[typings.reactNativeFirebase.reactNativeFirebaseStrings.CONNECT]
    
    inline def DELETE: typings.reactNativeFirebase.reactNativeFirebaseStrings.DELETE = "DELETE".asInstanceOf[typings.reactNativeFirebase.reactNativeFirebaseStrings.DELETE]
    
    inline def GET: typings.reactNativeFirebase.reactNativeFirebaseStrings.GET = "GET".asInstanceOf[typings.reactNativeFirebase.reactNativeFirebaseStrings.GET]
    
    inline def HEAD: typings.reactNativeFirebase.reactNativeFirebaseStrings.HEAD = "HEAD".asInstanceOf[typings.reactNativeFirebase.reactNativeFirebaseStrings.HEAD]
    
    inline def OPTIONS: typings.reactNativeFirebase.reactNativeFirebaseStrings.OPTIONS = "OPTIONS".asInstanceOf[typings.reactNativeFirebase.reactNativeFirebaseStrings.OPTIONS]
    
    inline def PATCH: typings.reactNativeFirebase.reactNativeFirebaseStrings.PATCH = "PATCH".asInstanceOf[typings.reactNativeFirebase.reactNativeFirebaseStrings.PATCH]
    
    inline def POST: typings.reactNativeFirebase.reactNativeFirebaseStrings.POST = "POST".asInstanceOf[typings.reactNativeFirebase.reactNativeFirebaseStrings.POST]
    
    inline def PUT: typings.reactNativeFirebase.reactNativeFirebaseStrings.PUT = "PUT".asInstanceOf[typings.reactNativeFirebase.reactNativeFirebaseStrings.PUT]
    
    inline def TRACE: typings.reactNativeFirebase.reactNativeFirebaseStrings.TRACE = "TRACE".asInstanceOf[typings.reactNativeFirebase.reactNativeFirebaseStrings.TRACE]
  }
  
  trait HttpMetric extends StObject {
    
    /**
      * Return an attribute by name, or null if it does not exist.
      */
    def getAttribute(attribute: String): js.Promise[String | Null]
    
    /**
      * Return an object of key-value attributes.
      */
    def getAttributes(): js.Promise[js.Object]
    
    /**
      * Set an attribute. Returns true if it was set, false if it was not.
      */
    def putAttribute(attribute: String, value: String): js.Promise[`true` | `false`]
    
    /**
      * Remove an attribute by name.
      */
    def removeAttribute(attribute: String): js.Promise[Null]
    
    /**
      * Set the request HTTP response code.
      */
    def setHttpResponseCode(code: Double): js.Promise[Null]
    
    /**
      * Set the request payload size, in bytes.
      */
    def setRequestPayloadSize(bytes: Double): js.Promise[Null]
    
    /**
      * Set the response content type.
      */
    def setResponseContentType(`type`: String): js.Promise[Null]
    
    /**
      * Set the response payload size, in bytes.
      */
    def setResponsePayloadSize(bytes: Double): js.Promise[Null]
    
    /**
      * Start a HttpMetric instance.
      */
    def start(): js.Promise[Null]
    
    /**
      * Stop a HttpMetric instance.
      */
    def stop(): js.Promise[Null]
  }
  object HttpMetric {
    
    inline def apply(
      getAttribute: String => js.Promise[String | Null],
      getAttributes: () => js.Promise[js.Object],
      putAttribute: (String, String) => js.Promise[`true` | `false`],
      removeAttribute: String => js.Promise[Null],
      setHttpResponseCode: Double => js.Promise[Null],
      setRequestPayloadSize: Double => js.Promise[Null],
      setResponseContentType: String => js.Promise[Null],
      setResponsePayloadSize: Double => js.Promise[Null],
      start: () => js.Promise[Null],
      stop: () => js.Promise[Null]
    ): HttpMetric = {
      val __obj = js.Dynamic.literal(getAttribute = js.Any.fromFunction1(getAttribute), getAttributes = js.Any.fromFunction0(getAttributes), putAttribute = js.Any.fromFunction2(putAttribute), removeAttribute = js.Any.fromFunction1(removeAttribute), setHttpResponseCode = js.Any.fromFunction1(setHttpResponseCode), setRequestPayloadSize = js.Any.fromFunction1(setRequestPayloadSize), setResponseContentType = js.Any.fromFunction1(setResponseContentType), setResponsePayloadSize = js.Any.fromFunction1(setResponsePayloadSize), start = js.Any.fromFunction0(start), stop = js.Any.fromFunction0(stop))
      __obj.asInstanceOf[HttpMetric]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HttpMetric] (val x: Self) extends AnyVal {
      
      inline def setGetAttribute(value: String => js.Promise[String | Null]): Self = StObject.set(x, "getAttribute", js.Any.fromFunction1(value))
      
      inline def setGetAttributes(value: () => js.Promise[js.Object]): Self = StObject.set(x, "getAttributes", js.Any.fromFunction0(value))
      
      inline def setPutAttribute(value: (String, String) => js.Promise[`true` | `false`]): Self = StObject.set(x, "putAttribute", js.Any.fromFunction2(value))
      
      inline def setRemoveAttribute(value: String => js.Promise[Null]): Self = StObject.set(x, "removeAttribute", js.Any.fromFunction1(value))
      
      inline def setSetHttpResponseCode(value: Double => js.Promise[Null]): Self = StObject.set(x, "setHttpResponseCode", js.Any.fromFunction1(value))
      
      inline def setSetRequestPayloadSize(value: Double => js.Promise[Null]): Self = StObject.set(x, "setRequestPayloadSize", js.Any.fromFunction1(value))
      
      inline def setSetResponseContentType(value: String => js.Promise[Null]): Self = StObject.set(x, "setResponseContentType", js.Any.fromFunction1(value))
      
      inline def setSetResponsePayloadSize(value: Double => js.Promise[Null]): Self = StObject.set(x, "setResponsePayloadSize", js.Any.fromFunction1(value))
      
      inline def setStart(value: () => js.Promise[Null]): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
      
      inline def setStop(value: () => js.Promise[Null]): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
    }
  }
  
  trait Perf extends StObject {
    
    /**
      * Returns a new HTTP Metric instance.
      */
    def newHttpMetric(url: String, httpMethod: HttpMethod): HttpMetric
    
    /**
      * Returns a new Trace instance.
      */
    def newTrace(trace: String): Trace
    
    /**
      * Globally enable or disable performance monitoring.
      */
    def setPerformanceCollectionEnabled(enabled: Boolean): Unit
  }
  object Perf {
    
    inline def apply(
      newHttpMetric: (String, HttpMethod) => HttpMetric,
      newTrace: String => Trace,
      setPerformanceCollectionEnabled: Boolean => Unit
    ): Perf = {
      val __obj = js.Dynamic.literal(newHttpMetric = js.Any.fromFunction2(newHttpMetric), newTrace = js.Any.fromFunction1(newTrace), setPerformanceCollectionEnabled = js.Any.fromFunction1(setPerformanceCollectionEnabled))
      __obj.asInstanceOf[Perf]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Perf] (val x: Self) extends AnyVal {
      
      inline def setNewHttpMetric(value: (String, HttpMethod) => HttpMetric): Self = StObject.set(x, "newHttpMetric", js.Any.fromFunction2(value))
      
      inline def setNewTrace(value: String => Trace): Self = StObject.set(x, "newTrace", js.Any.fromFunction1(value))
      
      inline def setSetPerformanceCollectionEnabled(value: Boolean => Unit): Self = StObject.set(x, "setPerformanceCollectionEnabled", js.Any.fromFunction1(value))
    }
  }
  
  trait Trace extends StObject {
    
    /**
      * Return an attribute by name, or null if it does not exist.
      */
    def getAttribute(attribute: String): js.Promise[String | Null]
    
    /**
      * Return an object of key-value attributes.
      */
    def getAttributes(): js.Promise[js.Object]
    
    /**
      * Get a metric by name. Returns 0 if it does not exist.
      */
    def getMetric(metricName: String): js.Promise[Double]
    
    /**
      * Increment a metric by name and value.
      */
    def incrementMetric(metricName: String, incrementBy: Double): js.Promise[Null]
    
    /**
      * Set an attribute. Returns true if it was set, false if it was not.
      */
    def putAttribute(attribute: String, value: String): js.Promise[`true` | `false`]
    
    /**
      * Set a metric.
      */
    def putMetric(metricName: String, value: Double): js.Promise[Null]
    
    /**
      * Remove an attribute by name.
      */
    def removeAttribute(attribute: String): js.Promise[Null]
    
    /**
      * Start a Trace instance.
      */
    def start(): js.Promise[Null]
    
    /**
      * Stop a Trace instance.
      */
    def stop(): js.Promise[Null]
  }
  object Trace {
    
    inline def apply(
      getAttribute: String => js.Promise[String | Null],
      getAttributes: () => js.Promise[js.Object],
      getMetric: String => js.Promise[Double],
      incrementMetric: (String, Double) => js.Promise[Null],
      putAttribute: (String, String) => js.Promise[`true` | `false`],
      putMetric: (String, Double) => js.Promise[Null],
      removeAttribute: String => js.Promise[Null],
      start: () => js.Promise[Null],
      stop: () => js.Promise[Null]
    ): Trace = {
      val __obj = js.Dynamic.literal(getAttribute = js.Any.fromFunction1(getAttribute), getAttributes = js.Any.fromFunction0(getAttributes), getMetric = js.Any.fromFunction1(getMetric), incrementMetric = js.Any.fromFunction2(incrementMetric), putAttribute = js.Any.fromFunction2(putAttribute), putMetric = js.Any.fromFunction2(putMetric), removeAttribute = js.Any.fromFunction1(removeAttribute), start = js.Any.fromFunction0(start), stop = js.Any.fromFunction0(stop))
      __obj.asInstanceOf[Trace]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Trace] (val x: Self) extends AnyVal {
      
      inline def setGetAttribute(value: String => js.Promise[String | Null]): Self = StObject.set(x, "getAttribute", js.Any.fromFunction1(value))
      
      inline def setGetAttributes(value: () => js.Promise[js.Object]): Self = StObject.set(x, "getAttributes", js.Any.fromFunction0(value))
      
      inline def setGetMetric(value: String => js.Promise[Double]): Self = StObject.set(x, "getMetric", js.Any.fromFunction1(value))
      
      inline def setIncrementMetric(value: (String, Double) => js.Promise[Null]): Self = StObject.set(x, "incrementMetric", js.Any.fromFunction2(value))
      
      inline def setPutAttribute(value: (String, String) => js.Promise[`true` | `false`]): Self = StObject.set(x, "putAttribute", js.Any.fromFunction2(value))
      
      inline def setPutMetric(value: (String, Double) => js.Promise[Null]): Self = StObject.set(x, "putMetric", js.Any.fromFunction2(value))
      
      inline def setRemoveAttribute(value: String => js.Promise[Null]): Self = StObject.set(x, "removeAttribute", js.Any.fromFunction1(value))
      
      inline def setStart(value: () => js.Promise[Null]): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
      
      inline def setStop(value: () => js.Promise[Null]): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
    }
  }
}
