package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a collection of SP.List objects */
@js.native
trait ListCollection
  extends ClientObjectCollection[List[js.Any]] {
  
  /** Creates a new list or a document library. */
  def add(parameters: ListCreationInformation): List[_] = js.native
  
  /** Gets a list that is the default asset location for images or other files, which the users upload to their wiki pages. */
  def ensureSiteAssetsLibrary(): List[_] = js.native
  
  /** Gets a list that is the default location for wiki pages. */
  def ensureSitePagesLibrary(): List[_] = js.native
  
  /** Returns the list with the specified list identifier. */
  def getById[T](id: String): List[T] = js.native
  def getById[T](id: Guid): List[T] = js.native
  
  /** Returns the list with the specified title from the collection. */
  def getByTitle[T](title: String): List[T] = js.native
  
  /** Gets the list at the specified index in the collection. */
  def get_item[T](index: Double): List[T] = js.native
  
  /** Gets the list at the specified index in the collection. */
  def itemAt[T](index: Double): List[T] = js.native
}
