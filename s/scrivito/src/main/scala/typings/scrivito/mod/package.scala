package typings.scrivito.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.react.mod.ComponentType
import typings.scrivito.anon.Content
import typings.scrivito.anon.DumpLoaded
import typings.scrivito.anon.Hash
import typings.scrivito.anon.Length
import typings.scrivito.anon.Message
import typings.scrivito.anon.PreloadDump
import typings.scrivito.anon.Query
import typings.scrivito.mod.^
import typings.scrivito.scrivitoStrings.asc
import typings.scrivito.scrivitoStrings.desc
import typings.std.History
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def canWrite(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("canWrite")().asInstanceOf[Boolean]

inline def configure(options: ConfigOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("configure")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def configureContentBrowser(options: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("configureContentBrowser")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def configureObjClassForContentType(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("configureObjClassForContentType")().asInstanceOf[Unit]
inline def configureObjClassForContentType(mapping: StringDictionary[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("configureObjClassForContentType")(mapping.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def connect[C /* <: ComponentType[Any] */](component: C): C = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(component.asInstanceOf[js.Any]).asInstanceOf[C]

inline def createObjClass(options: ObjClassOptions): Obj = ^.asInstanceOf[js.Dynamic].applyDynamic("createObjClass")(options.asInstanceOf[js.Any]).asInstanceOf[Obj]

inline def createWidgetClass(options: WidgetClassOptions): AbstractWidgetClass = ^.asInstanceOf[js.Dynamic].applyDynamic("createWidgetClass")(options.asInstanceOf[js.Any]).asInstanceOf[AbstractWidgetClass]

inline def currentEditor(): Editor | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("currentEditor")().asInstanceOf[Editor | Null]

inline def currentPage(): Obj = ^.asInstanceOf[js.Dynamic].applyDynamic("currentPage")().asInstanceOf[Obj]

inline def currentPageParams(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("currentPageParams")().asInstanceOf[Any]

inline def currentWorkspace(): Workspace = ^.asInstanceOf[js.Dynamic].applyDynamic("currentWorkspace")().asInstanceOf[Workspace]

inline def currentWorkspaceId(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("currentWorkspaceId")().asInstanceOf[String]

inline def extendMenu(menuCallback: js.Function1[/* menu */ Menu, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("extendMenu")(menuCallback.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def extractText(obj: Obj, options: Length): String = (^.asInstanceOf[js.Dynamic].applyDynamic("extractText")(obj.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]

inline def finishLoading(): js.Promise[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("finishLoading")().asInstanceOf[js.Promise[js.Object]]

inline def getClass_(name: String): ObjClass | WidgetClass | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getClass")(name.asInstanceOf[js.Any]).asInstanceOf[ObjClass | WidgetClass | Null]

inline def isComparisonActive(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isComparisonActive")().asInstanceOf[Boolean]

inline def isEditorLoggedIn(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEditorLoggedIn")().asInstanceOf[Boolean]

inline def isInPlaceEditingActive(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInPlaceEditingActive")().asInstanceOf[Boolean]

inline def load[T](functionToLoad: js.Function0[T]): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(functionToLoad.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]

inline def navigateTo(target: js.Function0[Obj | Link]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("navigateTo")(target.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def navigateTo(target: js.Function0[Obj | Link], options: Hash): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("navigateTo")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def navigateTo(target: Link): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("navigateTo")(target.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def navigateTo(target: Link, options: Hash): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("navigateTo")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def navigateTo(target: Obj): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("navigateTo")(target.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def navigateTo(target: Obj, options: Hash): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("navigateTo")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def openDialog(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("openDialog")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def preload(preloadDump: Any): js.Promise[DumpLoaded] = ^.asInstanceOf[js.Dynamic].applyDynamic("preload")(preloadDump.asInstanceOf[js.Any]).asInstanceOf[js.Promise[DumpLoaded]]

inline def provideAuthGroups(options: AuthGroupsOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("provideAuthGroups")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def provideComponent(className: String, component: ObjComponent | WidgetComponent): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("provideComponent")(className.asInstanceOf[js.Any], component.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def provideEditingConfig(name: String, editingConfig: EditingConfig): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("provideEditingConfig")(name.asInstanceOf[js.Any], editingConfig.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def provideObjClass(name: String, contentClassOrOptions: AbstractObjClass): ObjClass = (^.asInstanceOf[js.Dynamic].applyDynamic("provideObjClass")(name.asInstanceOf[js.Any], contentClassOrOptions.asInstanceOf[js.Any])).asInstanceOf[ObjClass]
inline def provideObjClass(name: String, contentClassOrOptions: ObjClassOptions): ObjClass = (^.asInstanceOf[js.Dynamic].applyDynamic("provideObjClass")(name.asInstanceOf[js.Any], contentClassOrOptions.asInstanceOf[js.Any])).asInstanceOf[ObjClass]

inline def provideWidgetClass(name: String, contentClassOrOptions: AbstractWidgetClass): WidgetClass = (^.asInstanceOf[js.Dynamic].applyDynamic("provideWidgetClass")(name.asInstanceOf[js.Any], contentClassOrOptions.asInstanceOf[js.Any])).asInstanceOf[WidgetClass]
inline def provideWidgetClass(name: String, contentClassOrOptions: WidgetClassOptions): WidgetClass = (^.asInstanceOf[js.Dynamic].applyDynamic("provideWidgetClass")(name.asInstanceOf[js.Any], contentClassOrOptions.asInstanceOf[js.Any])).asInstanceOf[WidgetClass]

inline def registerComponent(name: String, component: ObjComponent | WidgetComponent): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerComponent")(name.asInstanceOf[js.Any], component.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def renderPage(page: Obj, renderFunction: js.Function0[Unit]): js.Promise[PreloadDump] = (^.asInstanceOf[js.Dynamic].applyDynamic("renderPage")(page.asInstanceOf[js.Any], renderFunction.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PreloadDump]]

inline def setVisitorIdToken(idToken: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setVisitorIdToken")(idToken.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def updateContent(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("updateContent")().asInstanceOf[Unit]

inline def updateMenuExtensions(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("updateMenuExtensions")().asInstanceOf[Unit]

inline def urlFor(target: Binary): String = ^.asInstanceOf[js.Dynamic].applyDynamic("urlFor")(target.asInstanceOf[js.Any]).asInstanceOf[String]
inline def urlFor(target: Binary, options: Query): String = (^.asInstanceOf[js.Dynamic].applyDynamic("urlFor")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
inline def urlFor(target: Link): String = ^.asInstanceOf[js.Dynamic].applyDynamic("urlFor")(target.asInstanceOf[js.Any]).asInstanceOf[String]
inline def urlFor(target: Link, options: Query): String = (^.asInstanceOf[js.Dynamic].applyDynamic("urlFor")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
inline def urlFor(target: Obj): String = ^.asInstanceOf[js.Dynamic].applyDynamic("urlFor")(target.asInstanceOf[js.Any]).asInstanceOf[String]
inline def urlFor(target: Obj, options: Query): String = (^.asInstanceOf[js.Dynamic].applyDynamic("urlFor")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]

inline def useHistory(history: History): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useHistory")(history.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def validationResultsFor(model: Obj, attribute: String): js.Array[ValidationResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("validationResultsFor")(model.asInstanceOf[js.Any], attribute.asInstanceOf[js.Any])).asInstanceOf[js.Array[ValidationResult]]
inline def validationResultsFor(model: Widget, attribute: String): js.Array[ValidationResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("validationResultsFor")(model.asInstanceOf[js.Any], attribute.asInstanceOf[js.Any])).asInstanceOf[js.Array[ValidationResult]]

type AttributeBasedValidation = js.Tuple2[String, AttributeValidationCallback]

// utility types
type AttributeKeys[T /* <: WidgetClassOptions | ObjClassOptions */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ Property in keyof T['attributes'] ]: any}
  */ typings.scrivito.scrivitoStrings.AttributeKeys & TopLevel[Any]

type AttributeValidationCallback = js.Function2[/* current */ Any, /* options */ js.UndefOr[Content], ValidationReturnType]

type AttributeWithOptions = js.Tuple2[Attribute, AttributeOptions]

type AuthGroupsOptions = StringDictionary[String]

type ClassBasedValidation = js.Function1[/* target */ Widget | Obj, ValidationReturnType]

type CreateAttributes = StringDictionary[Any]

type EditingConfigAttributes = StringDictionary[AttributeProps]

type ObjComponent = ComponentType[ObjComponentProps]

type ObjSearchAttribute = ObjSearchSingleAttribute | js.Array[ObjSearchSingleAttribute]

type ObjSearchAttributeBasedBoost = StringDictionary[Double]

/* Rewritten from type alias, can be one of: 
  - typings.scrivito.scrivitoStrings.Asterisk
  - typings.scrivito.scrivitoStrings.id
  - typings.scrivito.scrivitoStrings._createdAt
  - typings.scrivito.scrivitoStrings._lastChanged
  - typings.scrivito.scrivitoStrings._objClass
  - typings.scrivito.scrivitoStrings._path
  - typings.scrivito.scrivitoStrings._permalink
  - typings.scrivito.scrivitoStrings._restriction
  - typings.scrivito.scrivitoStrings.MetadataCollection
  - java.lang.String
*/
type ObjSearchSingleAttribute = _ObjSearchSingleAttribute | String

type ObjSearchValue = String | js.Date | Double | Obj | js.Array[Any]

type OrderParam = ObjSearchSingleAttribute | (js.Tuple2[ObjSearchSingleAttribute, asc | desc])

type Validation = AttributeBasedValidation | ClassBasedValidation

type ValidationReturnType = js.UndefOr[Message | String]

type WidgetClass = Instantiable1[/* arg */ js.Object, Widget]

type WidgetComponent = ComponentType[WidgetComponentProps]
