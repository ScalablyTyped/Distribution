package typings.reactNativeMaps.libMapViewDottypesMod

import typings.reactNative.mod.NativeSyntheticEvent
import typings.reactNativeMaps.anon.Continuous
import typings.reactNativeMaps.anon.Error
import typings.reactNativeMaps.anon.Markers
import typings.reactNativeMaps.anon.Name
import typings.reactNativeMaps.anon.`0`
import typings.reactNativeMaps.anon.`1`
import typings.reactNativeMaps.libSharedTypesMod.ClickEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ChangeEvent = NativeSyntheticEvent[Continuous]

type IndoorBuildingEvent = NativeSyntheticEvent[typings.reactNativeMaps.anon.IndoorBuilding]

type IndoorLevelActivatedEvent = NativeSyntheticEvent[typings.reactNativeMaps.anon.IndoorLevel]

type KmlMapEvent = NativeSyntheticEvent[Markers]

type LongPressEvent = ClickEvent[`0`]

type MapPressEvent = ClickEvent[`1`]

type PanDragEvent = ClickEvent[js.Object]

type PoiClickEvent = NativeSyntheticEvent[Name]

type UserLocationChangeEvent = NativeSyntheticEvent[Error]
