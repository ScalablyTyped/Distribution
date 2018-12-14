package typings
package readDashPackageDashTreeLib.readDashPackageDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("read-package-tree", "Link")
@js.native
class Link protected ()
  extends readDashPackageDashTreeLib.readDashPackageDashTreeMod.rptNs.Link {
  def this(pkg: js.Any, logical: java.lang.String, physical: java.lang.String, realpath: java.lang.String, er: scala.Null, cache: org.scalablytyped.runtime.StringDictionary[readDashPackageDashTreeLib.readDashPackageDashTreeMod.rptNs.Node]) = this()
  def this(pkg: js.Any, logical: java.lang.String, physical: java.lang.String, realpath: java.lang.String, er: stdLib.Error, cache: org.scalablytyped.runtime.StringDictionary[readDashPackageDashTreeLib.readDashPackageDashTreeMod.rptNs.Node]) = this()
  /* CompleteClass */
  override var children: js.Array[readDashPackageDashTreeLib.readDashPackageDashTreeMod.rptNs.Node] = js.native
  /* CompleteClass */
  override var error: stdLib.Error | scala.Null = js.native
  /* CompleteClass */
  override var id: scala.Double = js.native
  /* CompleteClass */
  override var isLink: scala.Boolean = js.native
  /* CompleteClass */
  @JSName("isLink")
  override var isLink_Link: readDashPackageDashTreeLib.readDashPackageDashTreeLibNumbers.`true` = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
  /* CompleteClass */
  override var `package`: js.Any = js.native
  /* CompleteClass */
  override var parent: readDashPackageDashTreeLib.readDashPackageDashTreeMod.rptNs.Node | scala.Null = js.native
  /* CompleteClass */
  override var path: java.lang.String = js.native
  /* CompleteClass */
  override var realpath: java.lang.String = js.native
  /* CompleteClass */
  override var target: readDashPackageDashTreeLib.readDashPackageDashTreeMod.rptNs.Node = js.native
}

