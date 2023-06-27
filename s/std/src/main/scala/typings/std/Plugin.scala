package typings.std

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides information about a browser plugin.
  * @deprecated
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Plugin)
  */
@js.native
trait Plugin
  extends StObject
     with /* standard dom */
/* index */ NumberDictionary[MimeType] {
  
  /**
    * Returns the plugin's description.
    * @deprecated
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Plugin/description)
    */
  /* standard dom */
  val description: java.lang.String = js.native
  
  /**
    * Returns the plugin library's filename, if applicable on the current platform.
    * @deprecated
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Plugin/filename)
    */
  /* standard dom */
  val filename: java.lang.String = js.native
  
  /**
    * Returns the specified MimeType object.
    * @deprecated
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Plugin/item)
    */
  /* standard dom */
  def item(index: Double): MimeType | Null = js.native
  
  /* standard dom.iterable */
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[MimeType]] = js.native
  
  /**
    * Returns the number of MIME types, represented by MimeType objects, supported by the plugin.
    * @deprecated
    */
  /* standard dom */
  val length: Double = js.native
  
  /**
    * Returns the plugin's name.
    * @deprecated
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Plugin/name)
    */
  /* standard dom */
  val name: java.lang.String = js.native
  
  /**
    * @deprecated
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Plugin/namedItem)
    */
  /* standard dom */
  def namedItem(name: java.lang.String): MimeType | Null = js.native
}
