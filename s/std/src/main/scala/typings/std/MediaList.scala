package typings.std

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaList
  extends /* index */ NumberDictionary[java.lang.String] {
  
  def appendMedium(medium: java.lang.String): Unit = js.native
  
  def deleteMedium(medium: java.lang.String): Unit = js.native
  
  def item(index: Double): java.lang.String | Null = js.native
  
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[java.lang.String]] = js.native
  
  val length: Double = js.native
  
  var mediaText: java.lang.String = js.native
}
