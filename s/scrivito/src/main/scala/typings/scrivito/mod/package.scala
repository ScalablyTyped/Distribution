package typings.scrivito.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


@scala.inline
def canWrite(): scala.Boolean = typings.scrivito.mod.^.asInstanceOf[js.Dynamic].applyDynamic("canWrite")().asInstanceOf[scala.Boolean]

@scala.inline
def configure(options: typings.scrivito.mod.ConfigOptions): scala.Unit = typings.scrivito.mod.^.asInstanceOf[js.Dynamic].applyDynamic("configure")(options.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

@scala.inline
def configureContentBrowser(options: js.Any): scala.Unit = typings.scrivito.mod.^.asInstanceOf[js.Dynamic].applyDynamic("configureContentBrowser")(options.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

@scala.inline
def connect(component: typings.react.mod.ComponentClass[js.Object, typings.react.mod.ComponentState]): scala.Unit = typings.scrivito.mod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(component.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
@scala.inline
def connect(component: typings.react.mod.FunctionComponent[js.Object]): scala.Unit = typings.scrivito.mod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(component.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

@scala.inline
def createObjClass(options: typings.scrivito.mod.ObjClassOptions): typings.scrivito.mod.AbstractObjClass = typings.scrivito.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createObjClass")(options.asInstanceOf[js.Any]).asInstanceOf[typings.scrivito.mod.AbstractObjClass]

@scala.inline
def createWidgetClass(options: typings.scrivito.mod.WidgetClassOptions): typings.scrivito.mod.AbstractWidgetClass = typings.scrivito.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createWidgetClass")(options.asInstanceOf[js.Any]).asInstanceOf[typings.scrivito.mod.AbstractWidgetClass]

@scala.inline
def currentPage(): typings.scrivito.mod.Obj = typings.scrivito.mod.^.asInstanceOf[js.Dynamic].applyDynamic("currentPage")().asInstanceOf[typings.scrivito.mod.Obj]

@scala.inline
def currentPageParams(): js.Any = typings.scrivito.mod.^.asInstanceOf[js.Dynamic].applyDynamic("currentPageParams")().asInstanceOf[js.Any]

@scala.inline
def extendMenu(menuCallback: js.Any): scala.Unit = typings.scrivito.mod.^.asInstanceOf[js.Dynamic].applyDynamic("extendMenu")(menuCallback.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

@scala.inline
def extractText(obj: typings.scrivito.mod.Obj, options: typings.scrivito.anon.Length): java.lang.String = (typings.scrivito.mod.^.asInstanceOf[js.Dynamic].applyDynamic("extractText")(obj.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]

@scala.inline
def finishLoading(): js.Promise[js.Object] = typings.scrivito.mod.^.asInstanceOf[js.Dynamic].applyDynamic("finishLoading")().asInstanceOf[js.Promise[js.Object]]

@scala.inline
def getClass_(name: java.lang.String): typings.scrivito.mod.ObjClass | typings.scrivito.mod.WidgetClass | scala.Null = typings.scrivito.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getClass")(name.asInstanceOf[js.Any]).asInstanceOf[typings.scrivito.mod.ObjClass | typings.scrivito.mod.WidgetClass | scala.Null]

@scala.inline
def isEditorLoggedIn(): scala.Boolean = typings.scrivito.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isEditorLoggedIn")().asInstanceOf[scala.Boolean]

@scala.inline
def isInPlaceEditingActive(): scala.Boolean = typings.scrivito.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isInPlaceEditingActive")().asInstanceOf[scala.Boolean]

@scala.inline
def load[T](functionToLoad: js.Function0[T]): js.Promise[T] = typings.scrivito.mod.^.asInstanceOf[js.Dynamic].applyDynamic("load")(functionToLoad.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]

@scala.inline
def navigateTo(target: js.Function0[typings.scrivito.mod.Obj | typings.scrivito.mod.Link]): scala.Unit = typings.scrivito.mod.^.asInstanceOf[js.Dynamic].applyDynamic("navigateTo")(target.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
@scala.inline
def navigateTo(
  target: js.Function0[typings.scrivito.mod.Obj | typings.scrivito.mod.Link],
  options: typings.scrivito.anon.Hash
): scala.Unit = (typings.scrivito.mod.^.asInstanceOf[js.Dynamic].applyDynamic("navigateTo")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def navigateTo(target: typings.scrivito.mod.Link): scala.Unit = typings.scrivito.mod.^.asInstanceOf[js.Dynamic].applyDynamic("navigateTo")(target.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
@scala.inline
def navigateTo(target: typings.scrivito.mod.Link, options: typings.scrivito.anon.Hash): scala.Unit = (typings.scrivito.mod.^.asInstanceOf[js.Dynamic].applyDynamic("navigateTo")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def navigateTo(target: typings.scrivito.mod.Obj): scala.Unit = typings.scrivito.mod.^.asInstanceOf[js.Dynamic].applyDynamic("navigateTo")(target.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
@scala.inline
def navigateTo(target: typings.scrivito.mod.Obj, options: typings.scrivito.anon.Hash): scala.Unit = (typings.scrivito.mod.^.asInstanceOf[js.Dynamic].applyDynamic("navigateTo")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def openDialog(name: java.lang.String): scala.Unit = typings.scrivito.mod.^.asInstanceOf[js.Dynamic].applyDynamic("openDialog")(name.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

@scala.inline
def preload(preloadDump: js.Any): js.Promise[typings.scrivito.anon.DumpLoaded] = typings.scrivito.mod.^.asInstanceOf[js.Dynamic].applyDynamic("preload")(preloadDump.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.scrivito.anon.DumpLoaded]]

@scala.inline
def provideComponent(
  className: java.lang.String,
  component: typings.scrivito.mod.ObjComponent | typings.scrivito.mod.WidgetComponent
): scala.Unit = (typings.scrivito.mod.^.asInstanceOf[js.Dynamic].applyDynamic("provideComponent")(className.asInstanceOf[js.Any], component.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def provideEditingConfig(name: java.lang.String, editingConfig: typings.scrivito.mod.EditingConfig): scala.Unit = (typings.scrivito.mod.^.asInstanceOf[js.Dynamic].applyDynamic("provideEditingConfig")(name.asInstanceOf[js.Any], editingConfig.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def provideObjClass(name: java.lang.String, contentClassOrOptions: typings.scrivito.mod.AbstractObjClass): typings.scrivito.mod.ObjClass = (typings.scrivito.mod.^.asInstanceOf[js.Dynamic].applyDynamic("provideObjClass")(name.asInstanceOf[js.Any], contentClassOrOptions.asInstanceOf[js.Any])).asInstanceOf[typings.scrivito.mod.ObjClass]
@scala.inline
def provideObjClass(name: java.lang.String, contentClassOrOptions: typings.scrivito.mod.ObjClassOptions): typings.scrivito.mod.ObjClass = (typings.scrivito.mod.^.asInstanceOf[js.Dynamic].applyDynamic("provideObjClass")(name.asInstanceOf[js.Any], contentClassOrOptions.asInstanceOf[js.Any])).asInstanceOf[typings.scrivito.mod.ObjClass]

@scala.inline
def provideWidgetClass(name: java.lang.String, contentClassOrOptions: typings.scrivito.mod.AbstractWidgetClass): typings.scrivito.mod.WidgetClass = (typings.scrivito.mod.^.asInstanceOf[js.Dynamic].applyDynamic("provideWidgetClass")(name.asInstanceOf[js.Any], contentClassOrOptions.asInstanceOf[js.Any])).asInstanceOf[typings.scrivito.mod.WidgetClass]
@scala.inline
def provideWidgetClass(name: java.lang.String, contentClassOrOptions: typings.scrivito.mod.WidgetClassOptions): typings.scrivito.mod.WidgetClass = (typings.scrivito.mod.^.asInstanceOf[js.Dynamic].applyDynamic("provideWidgetClass")(name.asInstanceOf[js.Any], contentClassOrOptions.asInstanceOf[js.Any])).asInstanceOf[typings.scrivito.mod.WidgetClass]

@scala.inline
def registerComponent(
  name: java.lang.String,
  component: typings.scrivito.mod.ObjComponent | typings.scrivito.mod.WidgetComponent
): scala.Unit = (typings.scrivito.mod.^.asInstanceOf[js.Dynamic].applyDynamic("registerComponent")(name.asInstanceOf[js.Any], component.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def renderPage(page: js.Any, renderFunction: js.Function0[scala.Unit]): js.Promise[typings.scrivito.anon.PreloadDump] = (typings.scrivito.mod.^.asInstanceOf[js.Dynamic].applyDynamic("renderPage")(page.asInstanceOf[js.Any], renderFunction.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.scrivito.anon.PreloadDump]]

@scala.inline
def setVisitorIdToken(idToken: java.lang.String): scala.Unit = typings.scrivito.mod.^.asInstanceOf[js.Dynamic].applyDynamic("setVisitorIdToken")(idToken.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

@scala.inline
def updateContent(): scala.Unit = typings.scrivito.mod.^.asInstanceOf[js.Dynamic].applyDynamic("updateContent")().asInstanceOf[scala.Unit]

@scala.inline
def updateMenuExtensions(): scala.Unit = typings.scrivito.mod.^.asInstanceOf[js.Dynamic].applyDynamic("updateMenuExtensions")().asInstanceOf[scala.Unit]

@scala.inline
def urlFor(target: typings.scrivito.mod.Binary): scala.Unit = typings.scrivito.mod.^.asInstanceOf[js.Dynamic].applyDynamic("urlFor")(target.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
@scala.inline
def urlFor(target: typings.scrivito.mod.Binary, options: typings.scrivito.anon.Query): scala.Unit = (typings.scrivito.mod.^.asInstanceOf[js.Dynamic].applyDynamic("urlFor")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def urlFor(target: typings.scrivito.mod.Link): scala.Unit = typings.scrivito.mod.^.asInstanceOf[js.Dynamic].applyDynamic("urlFor")(target.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
@scala.inline
def urlFor(target: typings.scrivito.mod.Link, options: typings.scrivito.anon.Query): scala.Unit = (typings.scrivito.mod.^.asInstanceOf[js.Dynamic].applyDynamic("urlFor")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def urlFor(target: typings.scrivito.mod.Obj): scala.Unit = typings.scrivito.mod.^.asInstanceOf[js.Dynamic].applyDynamic("urlFor")(target.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
@scala.inline
def urlFor(target: typings.scrivito.mod.Obj, options: typings.scrivito.anon.Query): scala.Unit = (typings.scrivito.mod.^.asInstanceOf[js.Dynamic].applyDynamic("urlFor")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def useHistory(history: typings.std.History): scala.Unit = typings.scrivito.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useHistory")(history.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

@scala.inline
def validationResults(model: typings.scrivito.mod.Obj, attribute: java.lang.String): js.Array[js.Object] = (typings.scrivito.mod.^.asInstanceOf[js.Dynamic].applyDynamic("validationResults")(model.asInstanceOf[js.Any], attribute.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Object]]
@scala.inline
def validationResults(model: typings.scrivito.mod.Widget, attribute: java.lang.String): js.Array[js.Object] = (typings.scrivito.mod.^.asInstanceOf[js.Dynamic].applyDynamic("validationResults")(model.asInstanceOf[js.Any], attribute.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Object]]

type AttributeBasedValidation = js.Tuple2[java.lang.String, typings.scrivito.mod.AttributeValidationCallback]

type AttributeValidationCallback = js.Function2[
/* current */ js.Any, 
/* options */ typings.scrivito.anon.Content, 
typings.scrivito.mod.ValidationReturnType]

type AttributeWithOptions = js.Tuple2[typings.scrivito.mod.Attribute, typings.scrivito.mod.AttributeOptions]

type ClassBasedValidation = js.Function1[
/* target */ typings.scrivito.mod.Widget | typings.scrivito.mod.Obj, 
typings.scrivito.mod.ValidationReturnType]

type EditingConfigAttributes = org.scalablytyped.runtime.StringDictionary[typings.scrivito.mod.AttributeProps]

type ObjComponent = typings.react.mod.FC[typings.scrivito.mod.ObjComponentProps]

type ObjSearchAttribute = typings.scrivito.mod.ObjSearchSingleAttribute | js.Array[typings.scrivito.mod.ObjSearchSingleAttribute]

type ObjSearchAttributeBasedBoost = org.scalablytyped.runtime.StringDictionary[scala.Double]

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
type ObjSearchSingleAttribute = typings.scrivito.mod._ObjSearchSingleAttribute | java.lang.String

type ObjSearchValue = java.lang.String | typings.std.Date | scala.Double | typings.scrivito.mod.Obj | js.Array[js.Any]

type OrderParam = typings.scrivito.mod.ObjSearchSingleAttribute | (js.Tuple2[
typings.scrivito.mod.ObjSearchSingleAttribute, 
typings.scrivito.scrivitoStrings.asc | typings.scrivito.scrivitoStrings.desc])

type Validation = typings.scrivito.mod.AttributeBasedValidation | typings.scrivito.mod.ClassBasedValidation

type ValidationReturnType = js.UndefOr[typings.scrivito.anon.Message | java.lang.String]

type WidgetClass = org.scalablytyped.runtime.Instantiable1[/* arg */ js.Object, typings.scrivito.mod.Widget]

type WidgetComponent = typings.react.mod.FC[typings.scrivito.mod.WidgetComponentProps]
