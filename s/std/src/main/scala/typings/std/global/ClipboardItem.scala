package typings.std.global

import typings.std.ClipboardItemOptions
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("ClipboardItem")
@js.native
open class ClipboardItem protected ()
  extends StObject
     with typings.std.ClipboardItem {
  /* standard dom */
  def this(items: Record[
        java.lang.String, 
        java.lang.String | typings.std.Blob | (js.Thenable[java.lang.String | typings.std.Blob])
      ]) = this()
  def this(
    items: Record[
        java.lang.String, 
        java.lang.String | typings.std.Blob | (js.Thenable[java.lang.String | typings.std.Blob])
      ],
    options: ClipboardItemOptions
  ) = this()
  
  /* standard dom */
  /* CompleteClass */
  override def getType(`type`: java.lang.String): js.Promise[typings.std.Blob] = js.native
  
  /* standard dom */
  /* CompleteClass */
  override val types: js.Array[java.lang.String] = js.native
}
