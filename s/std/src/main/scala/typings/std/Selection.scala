package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A Selection object represents the range of text selected by the user or the current position of the caret. To obtain a Selection object for examination or modification, call Window.getSelection(). */
@js.native
trait Selection extends StObject {
  
  /* standard dom */
  def addRange(range: Range): Unit = js.native
  
  /* standard dom */
  val anchorNode: Node | Null = js.native
  
  /* standard dom */
  val anchorOffset: Double = js.native
  
  /* standard dom */
  def collapse(): Unit = js.native
  def collapse(node: Null, offset: Double): Unit = js.native
  def collapse(node: Node): Unit = js.native
  def collapse(node: Node, offset: Double): Unit = js.native
  
  /* standard dom */
  def collapseToEnd(): Unit = js.native
  
  /* standard dom */
  def collapseToStart(): Unit = js.native
  
  /* standard dom */
  def containsNode(node: Node): scala.Boolean = js.native
  def containsNode(node: Node, allowPartialContainment: scala.Boolean): scala.Boolean = js.native
  
  /* standard dom */
  def deleteFromDocument(): Unit = js.native
  
  /* standard dom */
  def empty(): Unit = js.native
  
  /* standard dom */
  def extend(node: Node): Unit = js.native
  def extend(node: Node, offset: Double): Unit = js.native
  
  /* standard dom */
  val focusNode: Node | Null = js.native
  
  /* standard dom */
  val focusOffset: Double = js.native
  
  /* standard dom */
  def getRangeAt(index: Double): Range = js.native
  
  /* standard dom */
  val isCollapsed: scala.Boolean = js.native
  
  /* standard dom */
  def modify(): Unit = js.native
  def modify(alter: java.lang.String): Unit = js.native
  def modify(alter: java.lang.String, direction: java.lang.String): Unit = js.native
  def modify(alter: java.lang.String, direction: java.lang.String, granularity: java.lang.String): Unit = js.native
  def modify(alter: java.lang.String, direction: Unit, granularity: java.lang.String): Unit = js.native
  def modify(alter: Unit, direction: java.lang.String): Unit = js.native
  def modify(alter: Unit, direction: java.lang.String, granularity: java.lang.String): Unit = js.native
  def modify(alter: Unit, direction: Unit, granularity: java.lang.String): Unit = js.native
  
  /* standard dom */
  val rangeCount: Double = js.native
  
  /* standard dom */
  def removeAllRanges(): Unit = js.native
  
  /* standard dom */
  def removeRange(range: Range): Unit = js.native
  
  /* standard dom */
  def selectAllChildren(node: Node): Unit = js.native
  
  /* standard dom */
  def setBaseAndExtent(anchorNode: Node, anchorOffset: Double, focusNode: Node, focusOffset: Double): Unit = js.native
  
  /* standard dom */
  def setPosition(): Unit = js.native
  def setPosition(node: Null, offset: Double): Unit = js.native
  def setPosition(node: Node): Unit = js.native
  def setPosition(node: Node, offset: Double): Unit = js.native
  
  /* standard dom */
  val `type`: java.lang.String = js.native
}
