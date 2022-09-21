package typings.qlikVisualizationextensions

import typings.angular.mod.IPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BookmarkAPI {
  
  @js.native
  trait IBookmark extends StObject {
    
    /**
      * Applies a bookmark.
      * @param id - Bookmark id.
      * @return - A promise of a Qlik engine reply.
      */
    @JSName("apply")
    def apply(id: String): IPromise[Any] = js.native
    
    /**
      * Creates a bookmark based on the current selection.
      * @param title - Bookmark title.
      * @param description - Bookmark description.
      * @param [sheetId] - Optional. Bookmark sheet id. Introduced in version 2.2.
      * @return - A promise of a Qlik engine reply.
      */
    def create(title: String, description: String): IPromise[Any] = js.native
    def create(title: String, description: String, sheetId: String): IPromise[Any] = js.native
    
    /**
      * Removes a bookmark.
      * @param id - Bookmark id.
      * @return - A promise of a Qlik engine reply.
      */
    def remove(id: String): IPromise[Any] = js.native
  }
}
