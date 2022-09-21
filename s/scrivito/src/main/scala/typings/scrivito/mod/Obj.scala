package typings.scrivito.mod

import typings.scrivito.scrivitoStrings.`new`
import typings.scrivito.scrivitoStrings.deleted
import typings.scrivito.scrivitoStrings.edited
import typings.std.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("scrivito", "Obj")
@js.native
open class Obj protected () extends StObject {
  /* private */ def this(arg: js.Object) = this()
  
  /* private */ val _createdAt: js.Date = js.native
  
  /* private */ val _firstPublishedAt: js.Date = js.native
  
  /* private */ val _language: String = js.native
  
  /* private */ val _lastChanged: js.Date = js.native
  
  /* private */ val _objClass: String = js.native
  
  /* private */ val _path: String = js.native
  
  /* private */ val _permalink: String = js.native
  
  /* private */ val _publishedAt: js.Date = js.native
  
  /* private */ val _siteId: String | Null = js.native
  
  def ancestors(): js.Array[Obj] = js.native
  
  def backlinks(): js.Array[Obj] = js.native
  
  def children(): js.Array[Obj] = js.native
  
  def contentLength(): Double = js.native
  
  def contentType(): String = js.native
  
  def contentUrl(): String = js.native
  
  def copy(): js.Promise[Obj] = js.native
  
  def createdAt(): js.Date = js.native
  
  def destroy(): Unit = js.native
  
  def finishSaving(): js.Promise[Unit] = js.native
  
  def firstPublishedAt(): js.Date | Null = js.native
  
  def get(attributeName: String): Any = js.native
  
  // Instance methods
  def id(): String = js.native
  
  def isBinary(): Boolean = js.native
  
  def isRestricted(): Boolean = js.native
  
  def language(): String | Null = js.native
  
  def lastChanged(): js.Date | Null = js.native
  
  def metadata(): MetadataCollection = js.native
  
  def modification(): Null | `new` | edited | deleted = js.native
  
  def objClass(): String = js.native
  
  def onAllSites(): SiteContext = js.native
  
  def onSite(siteId: String): SiteContext = js.native
  
  def parent(): Obj | Null = js.native
  
  def path(): String | Null = js.native
  
  def permalink(): String | Null = js.native
  
  def publishedAt(): js.Date | Null = js.native
  
  def restrict(): Unit = js.native
  
  def siteId(): String | Null = js.native
  
  def slug(): String = js.native
  
  def unrestrict(): Unit = js.native
  
  def update(attributes: Any): Unit = js.native
  
  def updateReferences(mapping: js.Function1[/* refId */ String, js.UndefOr[String]]): js.Promise[Unit] = js.native
  
  def widget(id: String): Widget | Null = js.native
  
  def widgets(): js.Array[Widget] = js.native
}
/* static members */
object Obj {
  
  @JSImport("scrivito", "Obj")
  @js.native
  val ^ : js.Any = js.native
  
  // Static methods
  inline def all(): ObjSearch = ^.asInstanceOf[js.Dynamic].applyDynamic("all")().asInstanceOf[ObjSearch]
  
  inline def create(): Obj = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Obj]
  inline def create(attributes: CreateAttributes): Obj = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(attributes.asInstanceOf[js.Any]).asInstanceOf[Obj]
  
  inline def createFromFile(file: File, attributes: CreateAttributes): js.Promise[Obj] = (^.asInstanceOf[js.Dynamic].applyDynamic("createFromFile")(file.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Obj]]
  
  inline def get(id: String): Obj | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(id.asInstanceOf[js.Any]).asInstanceOf[Obj | Null]
  
  inline def getByPath(path: String): Obj | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getByPath")(path.asInstanceOf[js.Any]).asInstanceOf[Obj | Null]
  
  inline def getByPermalink(permalink: String): Obj | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getByPermalink")(permalink.asInstanceOf[js.Any]).asInstanceOf[Obj | Null]
  
  inline def onAllSites(): SiteContext = ^.asInstanceOf[js.Dynamic].applyDynamic("onAllSites")().asInstanceOf[SiteContext]
  
  inline def onSite(siteId: String): SiteContext = ^.asInstanceOf[js.Dynamic].applyDynamic("onSite")(siteId.asInstanceOf[js.Any]).asInstanceOf[SiteContext]
  
  inline def root(): Obj | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("root")().asInstanceOf[Obj | Null]
  
  inline def where(attribute: ObjSearchSingleAttribute, operator: ObjSearchOperator, value: ObjSearchValue): ObjSearch = (^.asInstanceOf[js.Dynamic].applyDynamic("where")(attribute.asInstanceOf[js.Any], operator.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[ObjSearch]
  inline def where(
    attribute: ObjSearchSingleAttribute,
    operator: ObjSearchOperator,
    value: ObjSearchValue,
    boost: Any
  ): ObjSearch = (^.asInstanceOf[js.Dynamic].applyDynamic("where")(attribute.asInstanceOf[js.Any], operator.asInstanceOf[js.Any], value.asInstanceOf[js.Any], boost.asInstanceOf[js.Any])).asInstanceOf[ObjSearch]
}
