package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a collection of SP.List objects */
@js.native
trait ListCollection
  extends StObject
     with ClientObjectCollection[typings.sharepoint.SP.List[Any]] {
  
  /** Creates a new list or a document library. */
  def add(parameters: ListCreationInformation): typings.sharepoint.SP.List[Any] = js.native
  
  /** Gets a list that is the default asset location for images or other files, which the users upload to their wiki pages. */
  def ensureSiteAssetsLibrary(): typings.sharepoint.SP.List[Any] = js.native
  
  /** Gets a list that is the default location for wiki pages. */
  def ensureSitePagesLibrary(): typings.sharepoint.SP.List[Any] = js.native
  
  /** Returns the list with the specified list identifier. */
  def getById[T](id: String): typings.sharepoint.SP.List[T] = js.native
  def getById[T](id: Guid): typings.sharepoint.SP.List[T] = js.native
  
  /** Returns the list with the specified title from the collection. */
  def getByTitle[T](title: String): typings.sharepoint.SP.List[T] = js.native
  
  /** Gets the list at the specified index in the collection. */
  def get_item[T](index: Double): typings.sharepoint.SP.List[T] = js.native
  
  /** Gets the list at the specified index in the collection. */
  def itemAt[T](index: Double): typings.sharepoint.SP.List[T] = js.native
}
