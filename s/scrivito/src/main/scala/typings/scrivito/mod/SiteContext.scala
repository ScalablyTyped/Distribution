package typings.scrivito.mod

import typings.std.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SiteContext extends StObject {
  
  def all(): ObjSearch = js.native
  
  def create(attributes: js.Object): Obj = js.native
  
  def createFromFile(file: File, attributes: js.Object): js.Promise[Unit] = js.native
  
  def get(id: String): Obj | Null = js.native
  
  def getByPath(path: String): Obj | Null = js.native
  
  def getByPermalink(permalink: String): Obj | Null = js.native
  
  def root(): Obj | Null = js.native
  
  def where(attribute: ObjSearchSingleAttribute, operator: ObjSearchOperator, value: String): ObjSearch = js.native
  def where(attribute: ObjSearchSingleAttribute, operator: ObjSearchOperator, value: String, boost: Any): ObjSearch = js.native
}
