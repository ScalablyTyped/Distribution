package typings.scrivito.mod

import org.scalablytyped.runtime.Instantiable1
import typings.std.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjClass
  extends Instantiable1[/* arg */ js.Object, Obj] {
  
  // Static methods
  def all(): js.Any = js.native
  
  def create(attributes: CreateAttributes): Unit = js.native
  
  def createFromFile(file: File, attributes: CreateAttributes): Unit = js.native
  
  def get(id: String): Obj | Null = js.native
  
  def getByPath(path: String): Obj | Null = js.native
  
  def getByPermalink(permalink: String): Obj | Null = js.native
  
  def root(): Obj = js.native
  
  def where(attribute: ObjSearchSingleAttribute, operator: ObjSearchOperator, value: String): ObjSearch = js.native
  def where(attribute: ObjSearchSingleAttribute, operator: ObjSearchOperator, value: String, boost: js.Any): ObjSearch = js.native
}
