package typings.primereact.columnColumnMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/**
  * Custom filter event.
  * @see {@link ColumnProps.onFilterConstraintRemove}
  * @extends {ColumnFilterConstraintAddEvent}
  * @event
  */
type ColumnFilterConstraintRemoveEvent = ColumnFilterConstraintAddEvent

/**
  * Column Filter Footer Template Opitons
  * @extends {ColumnFilterApplyTemplateOptions}
  */
type ColumnFilterFooterTemplateOptions = ColumnFilterApplyTemplateOptions

/**
  * Column Filter Header Template Opitons
  * @extends {ColumnFilterApplyTemplateOptions}
  */
type ColumnFilterHeaderTemplateOptions = ColumnFilterApplyTemplateOptions

type ColumnFilterMatchModeOptions = /**
  * Filter match modes for specific columns.
  */
StringDictionary[String]

type ColumnFilterMeta = /**
  * Filter metadata for specific columns.
  */
StringDictionary[ColumnFilterMetaData]

type ColumnFilterModelOptions = /**
  * Object containing key-value pairs of column filter metadata or metadata with constraint.
  */
StringDictionary[ColumnFilterMetaData | ColumnFilterMetaDataWithConstraint]

/**
  * Column Header Options
  * @extends {ColumnHeaderOptions}
  */
type ColumnFooterOptions = ColumnHeaderOptions
