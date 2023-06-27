package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/console) */
@js.native
trait Console extends StObject {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/assert) */
  /* standard dom */
  def assert(condition: scala.Boolean, data: Any*): Unit = js.native
  def assert(condition: Unit, data: Any*): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/clear) */
  /* standard dom */
  def clear(): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/count) */
  /* standard dom */
  def count(): Unit = js.native
  def count(label: java.lang.String): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/countReset) */
  /* standard dom */
  def countReset(): Unit = js.native
  def countReset(label: java.lang.String): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/debug) */
  /* standard dom */
  def debug(data: Any*): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/dir) */
  /* standard dom */
  def dir(): Unit = js.native
  def dir(item: Any): Unit = js.native
  def dir(item: Any, options: Any): Unit = js.native
  def dir(item: Unit, options: Any): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/dirxml) */
  /* standard dom */
  def dirxml(data: Any*): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/error) */
  /* standard dom */
  def error(data: Any*): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/group) */
  /* standard dom */
  def group(data: Any*): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/groupCollapsed) */
  /* standard dom */
  def groupCollapsed(data: Any*): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/groupEnd) */
  /* standard dom */
  def groupEnd(): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/info) */
  /* standard dom */
  def info(data: Any*): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/log) */
  /* standard dom */
  def log(data: Any*): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/table) */
  /* standard dom */
  def table(): Unit = js.native
  def table(tabularData: Any): Unit = js.native
  def table(tabularData: Any, properties: js.Array[java.lang.String]): Unit = js.native
  def table(tabularData: Unit, properties: js.Array[java.lang.String]): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/time) */
  /* standard dom */
  def time(): Unit = js.native
  def time(label: java.lang.String): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/timeEnd) */
  /* standard dom */
  def timeEnd(): Unit = js.native
  def timeEnd(label: java.lang.String): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/timeLog) */
  /* standard dom */
  def timeLog(label: java.lang.String, data: Any*): Unit = js.native
  def timeLog(label: Unit, data: Any*): Unit = js.native
  
  /* standard dom */
  def timeStamp(): Unit = js.native
  def timeStamp(label: java.lang.String): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/trace) */
  /* standard dom */
  def trace(data: Any*): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/warn) */
  /* standard dom */
  def warn(data: Any*): Unit = js.native
}
