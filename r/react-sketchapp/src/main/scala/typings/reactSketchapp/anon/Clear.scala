package typings.reactSketchapp.anon

import org.scalablytyped.runtime.StringDictionary
import typings.reactSketchapp.libModuleSharedStylesTextStylesMod.Options
import typings.reactSketchapp.libModuleSharedStylesTextStylesMod.RegisteredStyle
import typings.reactSketchapp.libModuleSharedStylesTextStylesMod.StyleHash
import typings.reactSketchapp.libModuleTypesMod.PlatformBridge
import typings.reactSketchapp.libModuleTypesMod.SketchDocument
import typings.reactSketchapp.libModuleTypesMod.SketchDocumentData
import typings.reactSketchapp.libModuleTypesMod.TextStyle
import typings.reactSketchapp.libModuleTypesMod.WrappedSketchDocument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Clear extends StObject {
  
  def clear(): Unit = js.native
  
  def create(styles: StringDictionary[TextStyle]): StyleHash = js.native
  def create(styles: StringDictionary[TextStyle], options: Unit, platformBridge: PlatformBridge): StyleHash = js.native
  def create(styles: StringDictionary[TextStyle], options: Options): StyleHash = js.native
  def create(styles: StringDictionary[TextStyle], options: Options, platformBridge: PlatformBridge): StyleHash = js.native
  
  def get(name: String): js.UndefOr[TextStyle] = js.native
  def get(name: String, document: SketchDocument): js.UndefOr[TextStyle] = js.native
  def get(name: String, document: SketchDocumentData): js.UndefOr[TextStyle] = js.native
  def get(name: String, document: WrappedSketchDocument): js.UndefOr[TextStyle] = js.native
  
  def registerStyle(name: String, style: TextStyle): Unit = js.native
  def registerStyle(name: String, style: TextStyle, platformBridge: PlatformBridge): Unit = js.native
  
  def resolve(): js.UndefOr[RegisteredStyle] = js.native
  def resolve(style: TextStyle): js.UndefOr[RegisteredStyle] = js.native
  
  def styles(): StyleHash = js.native
  
  def toJSON(): js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.SharedStyle */ Any
  ] = js.native
}
