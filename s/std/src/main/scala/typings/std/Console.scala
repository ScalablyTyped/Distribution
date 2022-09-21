package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Console extends StObject {
  
  /* standard dom */
  def assert(condition: scala.Boolean, data: Any*): Unit = js.native
  def assert(condition: Unit, data: Any*): Unit = js.native
  
  /* standard dom */
  def clear(): Unit = js.native
  
  /* standard dom */
  def count(): Unit = js.native
  def count(label: java.lang.String): Unit = js.native
  
  /* standard dom */
  def countReset(): Unit = js.native
  def countReset(label: java.lang.String): Unit = js.native
  
  /* standard dom */
  def debug(data: Any*): Unit = js.native
  
  /* standard dom */
  def dir(): Unit = js.native
  def dir(item: Any): Unit = js.native
  def dir(item: Any, options: Any): Unit = js.native
  def dir(item: Unit, options: Any): Unit = js.native
  
  /* standard dom */
  def dirxml(data: Any*): Unit = js.native
  
  /* standard dom */
  def error(data: Any*): Unit = js.native
  
  /* standard dom */
  def group(data: Any*): Unit = js.native
  
  /* standard dom */
  def groupCollapsed(data: Any*): Unit = js.native
  
  /* standard dom */
  def groupEnd(): Unit = js.native
  
  /* standard dom */
  def info(data: Any*): Unit = js.native
  
  /* standard dom */
  def log(data: Any*): Unit = js.native
  
  /* standard dom */
  def table(): Unit = js.native
  def table(tabularData: Any): Unit = js.native
  def table(tabularData: Any, properties: js.Array[java.lang.String]): Unit = js.native
  def table(tabularData: Unit, properties: js.Array[java.lang.String]): Unit = js.native
  
  /* standard dom */
  def time(): Unit = js.native
  def time(label: java.lang.String): Unit = js.native
  
  /* standard dom */
  def timeEnd(): Unit = js.native
  def timeEnd(label: java.lang.String): Unit = js.native
  
  /* standard dom */
  def timeLog(label: java.lang.String, data: Any*): Unit = js.native
  def timeLog(label: Unit, data: Any*): Unit = js.native
  
  /* standard dom */
  def timeStamp(): Unit = js.native
  def timeStamp(label: java.lang.String): Unit = js.native
  
  /* standard dom */
  def trace(data: Any*): Unit = js.native
  
  /* standard dom */
  def warn(data: Any*): Unit = js.native
}
