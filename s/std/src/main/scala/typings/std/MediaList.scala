package typings.std

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaList
  extends StObject
     with /* standard dom */
/* index */ NumberDictionary[java.lang.String] {
  
  /* standard dom */
  def appendMedium(medium: java.lang.String): Unit = js.native
  
  /* standard dom */
  def deleteMedium(medium: java.lang.String): Unit = js.native
  
  /* standard dom */
  def item(index: Double): java.lang.String | Null = js.native
  
  /* standard dom.iterable */
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[java.lang.String]] = js.native
  
  /* standard dom */
  val length: Double = js.native
  
  /* standard dom */
  var mediaText: java.lang.String = js.native
}
