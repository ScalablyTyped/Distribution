package typings.scratchEnv

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/** The string name of a function which returns menu items. */
type ExtensionDynamicMenu = String

/** A menu item for which the label and value are identical strings. */
type ExtensionMenuItemSimple = String

/** Items in an extension menu. */
type ExtensionMenuItems = js.Array[ExtensionMenuItemSimple | ExtensionMenuItemComplex]

/** All the metadata needed to register an extension drop-down menu. */
type ExtensionMenuMetadata = ExtensionDynamicMenu | ExtensionMenuItems

type ValueOf[ObjectType] = /* import warning: importer.ImportType#apply Failed type conversion: ObjectType[keyof ObjectType] */ js.Any
