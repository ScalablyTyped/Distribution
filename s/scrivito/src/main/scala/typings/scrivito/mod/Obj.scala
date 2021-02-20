package typings.scrivito.mod

import typings.std.Date
import typings.std.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("scrivito", "Obj")
@js.native
class Obj protected () extends StObject {
  def this(arg: js.Object) = this()
  
  val _createdAt: Date = js.native
  
  val _firstPublishedAt: Date = js.native
  
  val _lastChanged: Date = js.native
  
  var _objClass: String = js.native
  
  var _path: String = js.native
  
  var _permalink: String = js.native
  
  val _publishedAt: Date = js.native
  
  def ancestors(): js.Array[Obj] = js.native
  
  def backlings(): js.Array[Obj] = js.native
  
  def children(): js.Array[Obj] = js.native
  
  def contentLength(): Double = js.native
  
  def contentType(): String = js.native
  
  def contentUrl(): String = js.native
  
  def copy(): js.Promise[Obj] = js.native
  
  def createdAt(): Date = js.native
  
  def destroy(): Unit = js.native
  
  def firstPublishedAt(): Date | Null = js.native
  
  def get(attributeName: String): js.Any | Null = js.native
  
  // Instance methods
  def id(): String = js.native
  
  def isBinary(): Boolean = js.native
  
  def isRestricted(): Boolean = js.native
  
  def lastChanged(): Date | Null = js.native
  
  def metadata(): js.Any = js.native
  
  def objClass(): String = js.native
  
  def parent(): Obj | Null = js.native
  
  def path(): String | Null = js.native
  
  def permalink(): String | Null = js.native
  
  def publishedAt(): Date | Null = js.native
  
  def restrict(): Unit = js.native
  
  def slug(): String = js.native
  
  def unrestrict(): Unit = js.native
  
  def update(attributes: js.Any): Unit = js.native
  
  def widget(id: String): Widget | Null = js.native
  
  def widgets(): js.Array[Widget] = js.native
}
/* static members */
object Obj {
  
  // Static methods
  @JSImport("scrivito", "Obj.all")
  @js.native
  def all(): js.Any = js.native
  
  @JSImport("scrivito", "Obj.create")
  @js.native
  def create(attributes: CreateAttributes): Unit = js.native
  
  @JSImport("scrivito", "Obj.createFromFile")
  @js.native
  def createFromFile(file: File, attributes: CreateAttributes): Unit = js.native
  
  @JSImport("scrivito", "Obj.get")
  @js.native
  def get(id: String): Obj | Null = js.native
  
  @JSImport("scrivito", "Obj.getByPath")
  @js.native
  def getByPath(path: String): Obj | Null = js.native
  
  @JSImport("scrivito", "Obj.getByPermalink")
  @js.native
  def getByPermalink(permalink: String): Obj | Null = js.native
  
  @JSImport("scrivito", "Obj.root")
  @js.native
  def root(): Obj = js.native
  
  @JSImport("scrivito", "Obj.where")
  @js.native
  def where(attribute: ObjSearchSingleAttribute, operator: ObjSearchOperator, value: String): ObjSearch = js.native
  @JSImport("scrivito", "Obj.where")
  @js.native
  def where(attribute: ObjSearchSingleAttribute, operator: ObjSearchOperator, value: String, boost: js.Any): ObjSearch = js.native
}
