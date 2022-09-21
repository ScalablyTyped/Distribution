package typings.std

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Used to store a list of Plugin objects describing the available plugins; it's returned by the window.navigator.plugins property. The PluginArray is not a JavaScript array, but has the length property and supports accessing individual items using bracket notation (plugins[2]), as well as via item(index) and namedItem("name") methods.
  * @deprecated
  */
@js.native
trait PluginArray
  extends StObject
     with /* standard dom */
/* index */ NumberDictionary[Plugin] {
  
  /** @deprecated */
  /* standard dom */
  def item(index: Double): Plugin | Null = js.native
  
  /* standard dom.iterable */
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[Plugin]] = js.native
  
  /** @deprecated */
  /* standard dom */
  val length: Double = js.native
  
  /** @deprecated */
  /* standard dom */
  def namedItem(name: java.lang.String): Plugin | Null = js.native
  
  /** @deprecated */
  /* standard dom */
  def refresh(): Unit = js.native
}
