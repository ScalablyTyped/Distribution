package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Console extends StObject {
  
  def assert(condition: js.UndefOr[scala.Nothing], data: js.Any*): Unit = js.native
  def assert(condition: scala.Boolean, data: js.Any*): Unit = js.native
  
  def clear(): Unit = js.native
  
  def count(): Unit = js.native
  def count(label: java.lang.String): Unit = js.native
  
  def countReset(): Unit = js.native
  def countReset(label: java.lang.String): Unit = js.native
  
  def debug(data: js.Any*): Unit = js.native
  
  def dir(): Unit = js.native
  def dir(item: js.UndefOr[scala.Nothing], options: js.Any): Unit = js.native
  def dir(item: js.Any): Unit = js.native
  def dir(item: js.Any, options: js.Any): Unit = js.native
  
  def dirxml(data: js.Any*): Unit = js.native
  
  def error(data: js.Any*): Unit = js.native
  
  def exception(message: js.UndefOr[scala.Nothing], optionalParams: js.Any*): Unit = js.native
  def exception(message: java.lang.String, optionalParams: js.Any*): Unit = js.native
  
  def group(data: js.Any*): Unit = js.native
  
  def groupCollapsed(data: js.Any*): Unit = js.native
  
  def groupEnd(): Unit = js.native
  
  def info(data: js.Any*): Unit = js.native
  
  def log(data: js.Any*): Unit = js.native
  
  var memory: js.Any = js.native
  
  def table(): Unit = js.native
  def table(tabularData: js.UndefOr[scala.Nothing], properties: js.Array[java.lang.String]): Unit = js.native
  def table(tabularData: js.Any): Unit = js.native
  def table(tabularData: js.Any, properties: js.Array[java.lang.String]): Unit = js.native
  
  def time(): Unit = js.native
  def time(label: java.lang.String): Unit = js.native
  
  def timeEnd(): Unit = js.native
  def timeEnd(label: java.lang.String): Unit = js.native
  
  def timeLog(label: js.UndefOr[scala.Nothing], data: js.Any*): Unit = js.native
  def timeLog(label: java.lang.String, data: js.Any*): Unit = js.native
  
  def timeStamp(): Unit = js.native
  def timeStamp(label: java.lang.String): Unit = js.native
  
  def trace(data: js.Any*): Unit = js.native
  
  def warn(data: js.Any*): Unit = js.native
}
