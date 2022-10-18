package typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod

import typings.snyk.anon.Severity
import typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.^
import typings.snyk.snykStrings.`no-op`
import typings.snyk.snykStrings.create
import typings.snyk.snykStrings.delete
import typings.snyk.snykStrings.engineType
import typings.snyk.snykStrings.fileContent
import typings.snyk.snykStrings.jsonContent
import typings.snyk.snykStrings.read
import typings.snyk.snykStrings.update
import typings.std.Omit
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def VALID_FILE_TYPES: js.Array[String] = ^.asInstanceOf[js.Dynamic].selectDynamic("VALID_FILE_TYPES").asInstanceOf[js.Array[String]]

inline def VALID_RESOURCE_ACTIONS_FOR_DELTA_SCAN: js.Array[ResourceActions] = ^.asInstanceOf[js.Dynamic].selectDynamic("VALID_RESOURCE_ACTIONS_FOR_DELTA_SCAN").asInstanceOf[js.Array[ResourceActions]]

inline def VALID_RESOURCE_ACTIONS_FOR_FULL_SCAN: js.Array[ResourceActions] = ^.asInstanceOf[js.Dynamic].selectDynamic("VALID_RESOURCE_ACTIONS_FOR_FULL_SCAN").asInstanceOf[js.Array[ResourceActions]]

inline def VALID_TERRAFORM_FILE_TYPES: js.Array[String] = ^.asInstanceOf[js.Dynamic].selectDynamic("VALID_TERRAFORM_FILE_TYPES").asInstanceOf[js.Array[String]]

type IacCustomPolicies = Record[String, Severity]

type ResourceActions = (js.Array[`no-op` | create | read | update | delete]) | (js.Tuple2[delete | create, create | delete])

type SafeAnalyticsOutput = Omit[IacFileParsed | IacFileParseFailure, fileContent | jsonContent | engineType]
