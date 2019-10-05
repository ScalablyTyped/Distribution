package typings.atPulumiAws

import typings.atPulumiAws.rdsInstanceTypeMod.InstanceType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/rds/instanceType", JSImport.Namespace)
@js.native
object rdsInstanceTypeMod extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typings.atPulumiAws.atPulumiAwsStrings.dbDOTt3DOTmicro
    - typings.atPulumiAws.atPulumiAwsStrings.dbDOTt3DOTsmall
    - typings.atPulumiAws.atPulumiAwsStrings.dbDOTt3DOTmedium
    - typings.atPulumiAws.atPulumiAwsStrings.dbDOTt3DOTlarge
    - typings.atPulumiAws.atPulumiAwsStrings.dbDOTt3DOTxlarge
    - typings.atPulumiAws.atPulumiAwsStrings.dbDOTt3DOT2xlarge
    - typings.atPulumiAws.atPulumiAwsStrings.dbDOTt2DOTmicro
    - typings.atPulumiAws.atPulumiAwsStrings.dbDOTt2DOTsmall
    - typings.atPulumiAws.atPulumiAwsStrings.dbDOTt2DOTmedium
    - typings.atPulumiAws.atPulumiAwsStrings.dbDOTt2DOTlarge
    - typings.atPulumiAws.atPulumiAwsStrings.dbDOTt2DOTxlarge
    - typings.atPulumiAws.atPulumiAwsStrings.dbDOTt2DOT2xlarge
    - typings.atPulumiAws.atPulumiAwsStrings.dbDOTm1DOTsmall
    - typings.atPulumiAws.atPulumiAwsStrings.dbDOTm1DOTmedium
    - typings.atPulumiAws.atPulumiAwsStrings.dbDOTm1DOTlarge
    - typings.atPulumiAws.atPulumiAwsStrings.dbDOTm1DOTxlarge
    - typings.atPulumiAws.atPulumiAwsStrings.dbDOTm2DOTxlarge
    - typings.atPulumiAws.atPulumiAwsStrings.dbDOTm2DOT2xlarge
    - typings.atPulumiAws.atPulumiAwsStrings.dbDOTm2DOT4xlarge
    - typings.atPulumiAws.atPulumiAwsStrings.dbDOTm3DOTmedium
    - typings.atPulumiAws.atPulumiAwsStrings.dbDOTm3DOTlarge
    - typings.atPulumiAws.atPulumiAwsStrings.dbDOTm3DOTxlarge
    - typings.atPulumiAws.atPulumiAwsStrings.dbDOTm3DOT2xlarge
    - typings.atPulumiAws.atPulumiAwsStrings.dbDOTm4DOTlarge
    - typings.atPulumiAws.atPulumiAwsStrings.dbDOTm4DOTxlarge
    - typings.atPulumiAws.atPulumiAwsStrings.dbDOTm4DOT2xlarge
    - typings.atPulumiAws.atPulumiAwsStrings.dbDOTm4DOT4xlarge
    - typings.atPulumiAws.atPulumiAwsStrings.dbDOTm4DOT10xlarge
    - typings.atPulumiAws.atPulumiAwsStrings.dbDOTm4DOT16xlarge
    - typings.atPulumiAws.atPulumiAwsStrings.dbDOTm5DOTlarge
    - typings.atPulumiAws.atPulumiAwsStrings.dbDOTm5DOTxlarge
    - typings.atPulumiAws.atPulumiAwsStrings.dbDOTm5DOT2xlarge
    - typings.atPulumiAws.atPulumiAwsStrings.dbDOTm5DOT4xlarge
    - typings.atPulumiAws.atPulumiAwsStrings.dbDOTm5DOT12xlarge
    - typings.atPulumiAws.atPulumiAwsStrings.dbDOTm5DOT24xlarge
    - typings.atPulumiAws.atPulumiAwsStrings.dbDOTr3DOTlarge
    - typings.atPulumiAws.atPulumiAwsStrings.dbDOTr3DOTxlarge
    - typings.atPulumiAws.atPulumiAwsStrings.dbDOTr3DOT2xlarge
    - typings.atPulumiAws.atPulumiAwsStrings.dbDOTr3DOT4xlarge
    - typings.atPulumiAws.atPulumiAwsStrings.dbDOTr3DOT8xlarge
    - typings.atPulumiAws.atPulumiAwsStrings.dbDOTr4DOTlarge
    - typings.atPulumiAws.atPulumiAwsStrings.dbDOTr4DOTxlarge
    - typings.atPulumiAws.atPulumiAwsStrings.dbDOTr4DOT2xlarge
    - typings.atPulumiAws.atPulumiAwsStrings.dbDOTr4DOT4xlarge
    - typings.atPulumiAws.atPulumiAwsStrings.dbDOTr4DOT8xlarge
    - typings.atPulumiAws.atPulumiAwsStrings.dbDOTr4DOT16xlarge
    - typings.atPulumiAws.atPulumiAwsStrings.dbDOTr5DOTlarge
    - typings.atPulumiAws.atPulumiAwsStrings.dbDOTr5DOTxlarge
    - typings.atPulumiAws.atPulumiAwsStrings.dbDOTr5DOT2xlarge
    - typings.atPulumiAws.atPulumiAwsStrings.dbDOTr5DOT4xlarge
    - typings.atPulumiAws.atPulumiAwsStrings.dbDOTr5DOT12xlarge
    - typings.atPulumiAws.atPulumiAwsStrings.dbDOTr5DOT24xlarge
    - typings.atPulumiAws.atPulumiAwsStrings.dbDOTx1DOT16xlarge
    - typings.atPulumiAws.atPulumiAwsStrings.dbDOTx1DOT32xlarge
    - typings.atPulumiAws.atPulumiAwsStrings.dbDOTx1eDOTxlarge
    - typings.atPulumiAws.atPulumiAwsStrings.dbDOTx1eDOT2xlarge
    - typings.atPulumiAws.atPulumiAwsStrings.dbDOTx1eDOT4xlarge
    - typings.atPulumiAws.atPulumiAwsStrings.dbDOTx1eDOT8xlarge
    - typings.atPulumiAws.atPulumiAwsStrings.dbDOTx1eDOT32xlarge
  */
  trait InstanceType extends js.Object
  
  @js.native
  object InstanceTypes extends js.Object {
    val M1_Large: InstanceType = js.native
    val M1_Medium: InstanceType = js.native
    val M1_Small: InstanceType = js.native
    val M1_XLarge: InstanceType = js.native
    val M2_2XLarge: InstanceType = js.native
    val M2_4XLarge: InstanceType = js.native
    val M2_XLarge: InstanceType = js.native
    val M3_2XLarge: InstanceType = js.native
    val M3_Large: InstanceType = js.native
    val M3_Medium: InstanceType = js.native
    val M3_XLarge: InstanceType = js.native
    val M4_10XLarge: InstanceType = js.native
    val M4_16XLarge: InstanceType = js.native
    val M4_2XLarge: InstanceType = js.native
    val M4_4XLarge: InstanceType = js.native
    val M4_Large: InstanceType = js.native
    val M4_XLarge: InstanceType = js.native
    val M5_12XLarge: InstanceType = js.native
    val M5_24XLarge: InstanceType = js.native
    val M5_2XLarge: InstanceType = js.native
    val M5_4XLarge: InstanceType = js.native
    val M5_Large: InstanceType = js.native
    val M5_XLarge: InstanceType = js.native
    val R3_2XLarge: InstanceType = js.native
    val R3_4XLarge: InstanceType = js.native
    val R3_8XLarge: InstanceType = js.native
    val R3_Large: InstanceType = js.native
    val R3_XLarge: InstanceType = js.native
    val R4_16XLarge: InstanceType = js.native
    val R4_2XLarge: InstanceType = js.native
    val R4_4XLarge: InstanceType = js.native
    val R4_8XLarge: InstanceType = js.native
    val R4_Large: InstanceType = js.native
    val R4_XLarge: InstanceType = js.native
    val R5_12XLarge: InstanceType = js.native
    val R5_24XLarge: InstanceType = js.native
    val R5_2XLarge: InstanceType = js.native
    val R5_4XLarge: InstanceType = js.native
    val R5_Large: InstanceType = js.native
    val R5_XLarge: InstanceType = js.native
    val T2_2XLarge: InstanceType = js.native
    val T2_Large: InstanceType = js.native
    val T2_Medium: InstanceType = js.native
    val T2_Micro: InstanceType = js.native
    val T2_Small: InstanceType = js.native
    val T2_XLarge: InstanceType = js.native
    val T3_2XLarge: InstanceType = js.native
    val T3_Large: InstanceType = js.native
    val T3_Medium: InstanceType = js.native
    val T3_Micro: InstanceType = js.native
    val T3_Small: InstanceType = js.native
    val T3_XLarge: InstanceType = js.native
    val X1E_2XLarge: InstanceType = js.native
    val X1E_32XLarge: InstanceType = js.native
    val X1E_4XLarge: InstanceType = js.native
    val X1E_8XLarge: InstanceType = js.native
    val X1E_XLarge: InstanceType = js.native
    val X1_16XLarge: InstanceType = js.native
    val X1_32XLarge: InstanceType = js.native
  }
  
}

