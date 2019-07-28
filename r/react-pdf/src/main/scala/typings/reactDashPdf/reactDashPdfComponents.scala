package typings.reactDashPdf

import typings.react.reactMod.ComponentType
import typings.reactDashPdf.distDocumentMod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactDashPdfComponents extends reactDashPdfProps {
  @scala.inline
  def Document: ComponentType[Props] = js.constructorOf[typings.reactDashPdf.distDocumentMod.default].asInstanceOf[typings.react.reactMod.ComponentType[typings.reactDashPdf.distDocumentMod.Props]]
  @scala.inline
  def Outline: ComponentType[typings.reactDashPdf.distOutlineMod.Props] = js.constructorOf[typings.reactDashPdf.distOutlineMod.default].asInstanceOf[typings.react.reactMod.ComponentType[typings.reactDashPdf.distOutlineMod.Props]]
  @scala.inline
  def Page: ComponentType[typings.reactDashPdf.distPageMod.Props] = js.constructorOf[typings.reactDashPdf.distPageMod.default].asInstanceOf[typings.react.reactMod.ComponentType[typings.reactDashPdf.distPageMod.Props]]
}

