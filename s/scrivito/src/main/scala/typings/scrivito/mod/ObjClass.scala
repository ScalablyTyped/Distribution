package typings.scrivito.mod

import org.scalablytyped.runtime.Instantiable1
import typings.std.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjClass
  extends StObject
     with Instantiable1[/* arg */ js.Object, Obj] {
  
  // Static methods
  def all(): ObjSearch = js.native
  
  def create(): Obj = js.native
  def create(attributes: CreateAttributes): Obj = js.native
  
  def createFromFile(file: File, attributes: CreateAttributes): js.Promise[Obj] = js.native
  
  def get(id: String): Obj | Null = js.native
  
  def getByPath(path: String): Obj | Null = js.native
  
  def getByPermalink(permalink: String): Obj | Null = js.native
  
  def onAllSites(): SiteContext = js.native
  
  def onSite(siteId: String): SiteContext = js.native
  
  def root(): Obj | Null = js.native
  
  def where(attribute: ObjSearchSingleAttribute, operator: ObjSearchOperator, value: ObjSearchValue): ObjSearch = js.native
  def where(
    attribute: ObjSearchSingleAttribute,
    operator: ObjSearchOperator,
    value: ObjSearchValue,
    boost: Any
  ): ObjSearch = js.native
}
