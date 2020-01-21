package typings.reactPdf

import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactPdfComponents extends reactPdfProps {
  @scala.inline
  def Document: ComponentType[DocumentProps] = js.constructorOf[typings.reactPdf.documentMod.default].asInstanceOf[typings.react.mod.ComponentType[DocumentProps]]
  @scala.inline
  def Outline: ComponentType[OutlineProps] = js.constructorOf[typings.reactPdf.outlineMod.default].asInstanceOf[typings.react.mod.ComponentType[OutlineProps]]
  @scala.inline
  def Page: ComponentType[PageProps] = js.constructorOf[typings.reactPdf.pageMod.default].asInstanceOf[typings.react.mod.ComponentType[PageProps]]
}

