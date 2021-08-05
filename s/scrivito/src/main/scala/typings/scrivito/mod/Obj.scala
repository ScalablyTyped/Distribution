package typings.scrivito.mod

import typings.std.Date
import typings.std.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("scrivito", "Obj")
@js.native
class Obj protected () extends StObject {
  def this(arg: js.Object) = this()
  
  /* private */ val _createdAt: Date = js.native
  
  /* private */ val _firstPublishedAt: Date = js.native
  
  /* private */ val _lastChanged: Date = js.native
  
  /* private */ var _objClass: String = js.native
  
  /* private */ var _path: String = js.native
  
  /* private */ var _permalink: String = js.native
  
  /* private */ val _publishedAt: Date = js.native
  
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
  
  @JSImport("scrivito", "Obj")
  @js.native
  val ^ : js.Any = js.native
  
  // Static methods
  inline def all(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("all")().asInstanceOf[js.Any]
  
  inline def create(attributes: CreateAttributes): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(attributes.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def createFromFile(file: File, attributes: CreateAttributes): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createFromFile")(file.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def get(id: String): Obj | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(id.asInstanceOf[js.Any]).asInstanceOf[Obj | Null]
  
  inline def getByPath(path: String): Obj | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getByPath")(path.asInstanceOf[js.Any]).asInstanceOf[Obj | Null]
  
  inline def getByPermalink(permalink: String): Obj | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getByPermalink")(permalink.asInstanceOf[js.Any]).asInstanceOf[Obj | Null]
  
  inline def root(): Obj = ^.asInstanceOf[js.Dynamic].applyDynamic("root")().asInstanceOf[Obj]
  
  inline def where(attribute: ObjSearchSingleAttribute, operator: ObjSearchOperator, value: String): ObjSearch = (^.asInstanceOf[js.Dynamic].applyDynamic("where")(attribute.asInstanceOf[js.Any], operator.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[ObjSearch]
  inline def where(attribute: ObjSearchSingleAttribute, operator: ObjSearchOperator, value: String, boost: js.Any): ObjSearch = (^.asInstanceOf[js.Dynamic].applyDynamic("where")(attribute.asInstanceOf[js.Any], operator.asInstanceOf[js.Any], value.asInstanceOf[js.Any], boost.asInstanceOf[js.Any])).asInstanceOf[ObjSearch]
}
