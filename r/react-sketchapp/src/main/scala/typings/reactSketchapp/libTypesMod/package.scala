package typings.reactSketchapp.libTypesMod

import typings.propTypes.mod.InferProps
import typings.propTypes.mod.InferType
import typings.propTypes.mod.Requireable
import typings.reactSketchapp.anon.AlignContent
import typings.reactSketchapp.anon.AlignSelf
import typings.reactSketchapp.reactSketchappStrings.dashed
import typings.reactSketchapp.reactSketchappStrings.dotted
import typings.reactSketchapp.reactSketchappStrings.hidden
import typings.reactSketchapp.reactSketchappStrings.scroll
import typings.reactSketchapp.reactSketchappStrings.solid
import typings.reactSketchapp.reactSketchappStrings.visible
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type BorderStyle = InferType[Requireable[dashed | dotted | solid]]

type Color = InferType[Requireable[String | Double]]

type MSColor = Any

type MSGradient = Any

type NSString = Any

type Overflow = InferType[Requireable[hidden | visible | scroll]]

type SketchLayer = Any

type SketchStyle = Any

type TextStyle = InferProps[AlignSelf] & typings.reactSketchapp.anon.Color

type ViewStyle = InferProps[AlignContent] & typings.reactSketchapp.anon.Color
