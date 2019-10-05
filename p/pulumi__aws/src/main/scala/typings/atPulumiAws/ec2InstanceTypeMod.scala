package typings.atPulumiAws

import typings.atPulumiAws.ec2InstanceTypeMod.InstanceType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2/instanceType", JSImport.Namespace)
@js.native
object ec2InstanceTypeMod extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typings.atPulumiAws.atPulumiAwsStrings.a1DOT2xlarge
    - typings.atPulumiAws.atPulumiAwsStrings.a1DOT4xlarge
    - typings.atPulumiAws.atPulumiAwsStrings.a1DOTlarge
    - typings.atPulumiAws.atPulumiAwsStrings.a1DOTmedium
    - typings.atPulumiAws.atPulumiAwsStrings.a1DOTxlarge
    - typings.atPulumiAws.atPulumiAwsStrings.c3DOT2xlarge
    - typings.atPulumiAws.atPulumiAwsStrings.c3DOT4xlarge
    - typings.atPulumiAws.atPulumiAwsStrings.c3DOT8xlarge
    - typings.atPulumiAws.atPulumiAwsStrings.c3DOTlarge
    - typings.atPulumiAws.atPulumiAwsStrings.c3DOTxlarge
    - typings.atPulumiAws.atPulumiAwsStrings.c4DOT2xlarge
    - typings.atPulumiAws.atPulumiAwsStrings.c4DOT4xlarge
    - typings.atPulumiAws.atPulumiAwsStrings.c4DOT8xlarge
    - typings.atPulumiAws.atPulumiAwsStrings.c4DOTlarge
    - typings.atPulumiAws.atPulumiAwsStrings.c4DOTxlarge
    - typings.atPulumiAws.atPulumiAwsStrings.c5DOT18xlarge
    - typings.atPulumiAws.atPulumiAwsStrings.c5DOT4xlarge
    - typings.atPulumiAws.atPulumiAwsStrings.c5DOT2xlarge
    - typings.atPulumiAws.atPulumiAwsStrings.c5DOTlarge
    - typings.atPulumiAws.atPulumiAwsStrings.c5DOT9xlarge
    - typings.atPulumiAws.atPulumiAwsStrings.c5dDOT18xlarge
    - typings.atPulumiAws.atPulumiAwsStrings.c5DOTxlarge
    - typings.atPulumiAws.atPulumiAwsStrings.c5dDOT4xlarge
    - typings.atPulumiAws.atPulumiAwsStrings.c5dDOT2xlarge
    - typings.atPulumiAws.atPulumiAwsStrings.c5dDOTlarge
    - typings.atPulumiAws.atPulumiAwsStrings.c5dDOT9xlarge
    - typings.atPulumiAws.atPulumiAwsStrings.c5nDOT18xlarge
    - typings.atPulumiAws.atPulumiAwsStrings.c5dDOTxlarge
    - typings.atPulumiAws.atPulumiAwsStrings.c5nDOT4xlarge
    - typings.atPulumiAws.atPulumiAwsStrings.c5nDOT2xlarge
    - typings.atPulumiAws.atPulumiAwsStrings.c5nDOT9xlarge
    - typings.atPulumiAws.atPulumiAwsStrings.c5nDOTlarge
    - typings.atPulumiAws.atPulumiAwsStrings.c5nDOTxlarge
    - typings.atPulumiAws.atPulumiAwsStrings.d2DOT2xlarge
    - typings.atPulumiAws.atPulumiAwsStrings.d2DOT4xlarge
    - typings.atPulumiAws.atPulumiAwsStrings.d2DOT8xlarge
    - typings.atPulumiAws.atPulumiAwsStrings.d2DOTxlarge
    - typings.atPulumiAws.atPulumiAwsStrings.f1DOT16xlarge
    - typings.atPulumiAws.atPulumiAwsStrings.f1DOT2xlarge
    - typings.atPulumiAws.atPulumiAwsStrings.g2DOT2xlarge
    - typings.atPulumiAws.atPulumiAwsStrings.g2DOT8xlarge
    - typings.atPulumiAws.atPulumiAwsStrings.g3DOT16xlarge
    - typings.atPulumiAws.atPulumiAwsStrings.g3DOT4xlarge
    - typings.atPulumiAws.atPulumiAwsStrings.g3DOT8xlarge
    - typings.atPulumiAws.atPulumiAwsStrings.g3sDOTxlarge
    - typings.atPulumiAws.atPulumiAwsStrings.h1DOT16xlarge
    - typings.atPulumiAws.atPulumiAwsStrings.h1DOT2xlarge
    - typings.atPulumiAws.atPulumiAwsStrings.h1DOT4xlarge
    - typings.atPulumiAws.atPulumiAwsStrings.h1DOT8xlarge
    - typings.atPulumiAws.atPulumiAwsStrings.hs1DOT8xlarge
    - typings.atPulumiAws.atPulumiAwsStrings.i3DOT16xlarge
    - typings.atPulumiAws.atPulumiAwsStrings.i3DOT2xlarge
    - typings.atPulumiAws.atPulumiAwsStrings.i3DOT4xlarge
    - typings.atPulumiAws.atPulumiAwsStrings.i3DOT8xlarge
    - typings.atPulumiAws.atPulumiAwsStrings.i3DOTlarge
    - typings.atPulumiAws.atPulumiAwsStrings.i3DOTxlarge
    - typings.atPulumiAws.atPulumiAwsStrings.i3DOTmetal
    - typings.atPulumiAws.atPulumiAwsStrings.m3DOT2xlarge
    - typings.atPulumiAws.atPulumiAwsStrings.m3DOTlarge
    - typings.atPulumiAws.atPulumiAwsStrings.m3DOTmedium
    - typings.atPulumiAws.atPulumiAwsStrings.m3DOTxlarge
    - typings.atPulumiAws.atPulumiAwsStrings.m4DOT10xlarge
    - typings.atPulumiAws.atPulumiAwsStrings.m4DOT16xlarge
    - typings.atPulumiAws.atPulumiAwsStrings.m4DOT2xlarge
    - typings.atPulumiAws.atPulumiAwsStrings.m4DOT4xlarge
    - typings.atPulumiAws.atPulumiAwsStrings.m4DOTlarge
    - typings.atPulumiAws.atPulumiAwsStrings.m4DOTxlarge
    - typings.atPulumiAws.atPulumiAwsStrings.m5DOTlarge
    - typings.atPulumiAws.atPulumiAwsStrings.m5DOTxlarge
    - typings.atPulumiAws.atPulumiAwsStrings.m5DOT2xlarge
    - typings.atPulumiAws.atPulumiAwsStrings.m5DOT4xlarge
    - typings.atPulumiAws.atPulumiAwsStrings.m5DOT12xlarge
    - typings.atPulumiAws.atPulumiAwsStrings.m5DOT24xlarge
    - typings.atPulumiAws.atPulumiAwsStrings.m5dDOTlarge
    - typings.atPulumiAws.atPulumiAwsStrings.m5dDOTxlarge
    - typings.atPulumiAws.atPulumiAwsStrings.m5dDOT2xlarge
    - typings.atPulumiAws.atPulumiAwsStrings.m5dDOT4xlarge
    - typings.atPulumiAws.atPulumiAwsStrings.m5dDOT12xlarge
    - typings.atPulumiAws.atPulumiAwsStrings.m5dDOT24xlarge
    - typings.atPulumiAws.atPulumiAwsStrings.m5aDOT12xlarge
    - typings.atPulumiAws.atPulumiAwsStrings.m5aDOT24xlarge
    - typings.atPulumiAws.atPulumiAwsStrings.m5aDOT2xlarge
    - typings.atPulumiAws.atPulumiAwsStrings.m5aDOT4xlarge
    - typings.atPulumiAws.atPulumiAwsStrings.m5aDOTlarge
    - typings.atPulumiAws.atPulumiAwsStrings.m5aDOTxlarge
    - typings.atPulumiAws.atPulumiAwsStrings.p2DOT16xlarge
    - typings.atPulumiAws.atPulumiAwsStrings.p2DOT8xlarge
    - typings.atPulumiAws.atPulumiAwsStrings.p2DOTxlarge
    - typings.atPulumiAws.atPulumiAwsStrings.p3DOT16xlarge
    - typings.atPulumiAws.atPulumiAwsStrings.p3DOT8xlarge
    - typings.atPulumiAws.atPulumiAwsStrings.p3DOT2xlarge
    - typings.atPulumiAws.atPulumiAwsStrings.p3dnDOT24xlarge
    - typings.atPulumiAws.atPulumiAwsStrings.r3DOT2xlarge
    - typings.atPulumiAws.atPulumiAwsStrings.r3DOT4xlarge
    - typings.atPulumiAws.atPulumiAwsStrings.r3DOT8xlarge
    - typings.atPulumiAws.atPulumiAwsStrings.r3DOTlarge
    - typings.atPulumiAws.atPulumiAwsStrings.r3DOTxlarge
    - typings.atPulumiAws.atPulumiAwsStrings.r4DOT16xlarge
    - typings.atPulumiAws.atPulumiAwsStrings.r4DOT2xlarge
    - typings.atPulumiAws.atPulumiAwsStrings.r4DOT4xlarge
    - typings.atPulumiAws.atPulumiAwsStrings.r4DOT8xlarge
    - typings.atPulumiAws.atPulumiAwsStrings.r4DOTlarge
    - typings.atPulumiAws.atPulumiAwsStrings.r4DOTxlarge
    - typings.atPulumiAws.atPulumiAwsStrings.r5DOT12xlarge
    - typings.atPulumiAws.atPulumiAwsStrings.r5DOT24xlarge
    - typings.atPulumiAws.atPulumiAwsStrings.r5DOT2xlarge
    - typings.atPulumiAws.atPulumiAwsStrings.r5DOT4xlarge
    - typings.atPulumiAws.atPulumiAwsStrings.r5DOTlarge
    - typings.atPulumiAws.atPulumiAwsStrings.r5DOTxlarge
    - typings.atPulumiAws.atPulumiAwsStrings.r5aDOT12xlarge
    - typings.atPulumiAws.atPulumiAwsStrings.r5aDOT24xlarge
    - typings.atPulumiAws.atPulumiAwsStrings.r5aDOT2xlarge
    - typings.atPulumiAws.atPulumiAwsStrings.r5aDOT4xlarge
    - typings.atPulumiAws.atPulumiAwsStrings.r5aDOTlarge
    - typings.atPulumiAws.atPulumiAwsStrings.r5aDOTxlarge
    - typings.atPulumiAws.atPulumiAwsStrings.r5dDOT12xlarge
    - typings.atPulumiAws.atPulumiAwsStrings.r5dDOT24xlarge
    - typings.atPulumiAws.atPulumiAwsStrings.r5dDOT2xlarge
    - typings.atPulumiAws.atPulumiAwsStrings.r5dDOT4xlarge
    - typings.atPulumiAws.atPulumiAwsStrings.r5dDOTlarge
    - typings.atPulumiAws.atPulumiAwsStrings.r5dDOTxlarge
    - typings.atPulumiAws.atPulumiAwsStrings.t2DOT2xlarge
    - typings.atPulumiAws.atPulumiAwsStrings.t2DOTlarge
    - typings.atPulumiAws.atPulumiAwsStrings.t2DOTmedium
    - typings.atPulumiAws.atPulumiAwsStrings.t2DOTmicro
    - typings.atPulumiAws.atPulumiAwsStrings.t2DOTnano
    - typings.atPulumiAws.atPulumiAwsStrings.t2DOTsmall
    - typings.atPulumiAws.atPulumiAwsStrings.t2DOTxlarge
    - typings.atPulumiAws.atPulumiAwsStrings.t3DOT2xlarge
    - typings.atPulumiAws.atPulumiAwsStrings.t3DOTlarge
    - typings.atPulumiAws.atPulumiAwsStrings.t3DOTmedium
    - typings.atPulumiAws.atPulumiAwsStrings.t3DOTmicro
    - typings.atPulumiAws.atPulumiAwsStrings.t3DOTnano
    - typings.atPulumiAws.atPulumiAwsStrings.t3DOTsmall
    - typings.atPulumiAws.atPulumiAwsStrings.t3DOTxlarge
    - typings.atPulumiAws.atPulumiAwsStrings.t3aDOT2xlarge
    - typings.atPulumiAws.atPulumiAwsStrings.t3aDOTlarge
    - typings.atPulumiAws.atPulumiAwsStrings.t3aDOTmedium
    - typings.atPulumiAws.atPulumiAwsStrings.t3aDOTmicro
    - typings.atPulumiAws.atPulumiAwsStrings.t3aDOTnano
    - typings.atPulumiAws.atPulumiAwsStrings.t3aDOTsmall
    - typings.atPulumiAws.atPulumiAwsStrings.t3aDOTxlarge
    - typings.atPulumiAws.atPulumiAwsStrings.`u-12tb1DOTmetal`
    - typings.atPulumiAws.atPulumiAwsStrings.`u-6tb1DOTmetal`
    - typings.atPulumiAws.atPulumiAwsStrings.`u-9tb1DOTmetal`
    - typings.atPulumiAws.atPulumiAwsStrings.x1DOT16xlarge
    - typings.atPulumiAws.atPulumiAwsStrings.x1DOT32xlarge
    - typings.atPulumiAws.atPulumiAwsStrings.x1eDOT16xlarge
    - typings.atPulumiAws.atPulumiAwsStrings.x1eDOT2xlarge
    - typings.atPulumiAws.atPulumiAwsStrings.x1eDOT32xlarge
    - typings.atPulumiAws.atPulumiAwsStrings.x1eDOT4xlarge
    - typings.atPulumiAws.atPulumiAwsStrings.x1eDOT8xlarge
    - typings.atPulumiAws.atPulumiAwsStrings.x1eDOTxlarge
    - typings.atPulumiAws.atPulumiAwsStrings.z1dDOT12xlarge
    - typings.atPulumiAws.atPulumiAwsStrings.z1dDOT2xlarge
    - typings.atPulumiAws.atPulumiAwsStrings.z1dDOT3xlarge
    - typings.atPulumiAws.atPulumiAwsStrings.z1dDOT6xlarge
    - typings.atPulumiAws.atPulumiAwsStrings.z1dDOTlarge
    - typings.atPulumiAws.atPulumiAwsStrings.z1dDOTxlarge
  */
  trait InstanceType extends js.Object
  
  val A1Instance2XLarge: InstanceType = js.native
  val A1Instance4XLarge: InstanceType = js.native
  val A1InstanceLarge: InstanceType = js.native
  val A1InstanceMedium: InstanceType = js.native
  val A1InstanceXLarge: InstanceType = js.native
  val C3Instance2XLarge: InstanceType = js.native
  val C3Instance4XLarge: InstanceType = js.native
  val C3Instance8XLarge: InstanceType = js.native
  val C3InstanceLarge: InstanceType = js.native
  val C3InstanceXLarge: InstanceType = js.native
  val C4Instance2XLarge: InstanceType = js.native
  val C4Instance4XLarge: InstanceType = js.native
  val C4Instance8XLarge: InstanceType = js.native
  val C4InstanceLarge: InstanceType = js.native
  val C4InstanceXLarge: InstanceType = js.native
  val C5Instance18XLarge: InstanceType = js.native
  val C5Instance2XLarge: InstanceType = js.native
  val C5Instance4XLarge: InstanceType = js.native
  val C5Instance9XLarge: InstanceType = js.native
  val C5InstanceLarge: InstanceType = js.native
  val C5InstanceXLarge: InstanceType = js.native
  val C5dInstance18XLarge: InstanceType = js.native
  val C5dInstance2XLarge: InstanceType = js.native
  val C5dInstance4XLarge: InstanceType = js.native
  val C5dInstance9XLarge: InstanceType = js.native
  val C5dInstanceLarge: InstanceType = js.native
  val C5dInstanceXLarge: InstanceType = js.native
  val C5nInstance18XLarge: InstanceType = js.native
  val C5nInstance2XLarge: InstanceType = js.native
  val C5nInstance4XLarge: InstanceType = js.native
  val C5nInstance9XLarge: InstanceType = js.native
  val C5nInstanceLarge: InstanceType = js.native
  val C5nInstanceXLarge: InstanceType = js.native
  val D2Instance2XLarge: InstanceType = js.native
  val D2Instance4XLarge: InstanceType = js.native
  val D2Instance8XLarge: InstanceType = js.native
  val D2InstanceXLarge: InstanceType = js.native
  val F1Instance16XLarge: InstanceType = js.native
  val F1Instance2XLarge: InstanceType = js.native
  val G2Instance2XLarge: InstanceType = js.native
  val G2Instance8XLarge: InstanceType = js.native
  val G3Instance16XLarge: InstanceType = js.native
  val G3Instance4XLarge: InstanceType = js.native
  val G3Instance8XLarge: InstanceType = js.native
  val G3sInstanceXLarge: InstanceType = js.native
  val H1Instance16XLarge: InstanceType = js.native
  val H1Instance2XLarge: InstanceType = js.native
  val H1Instance4XLarge: InstanceType = js.native
  val H1Instance8XLarge: InstanceType = js.native
  val Hs1Instance8XLarge: InstanceType = js.native
  val I3Instance16XLarge: InstanceType = js.native
  val I3Instance2XLarge: InstanceType = js.native
  val I3Instance4XLarge: InstanceType = js.native
  val I3Instance8XLarge: InstanceType = js.native
  val I3InstanceLarge: InstanceType = js.native
  val I3InstanceMetal: InstanceType = js.native
  val I3InstanceXLarge: InstanceType = js.native
  val M3Instance2XLarge: InstanceType = js.native
  val M3InstanceLarge: InstanceType = js.native
  val M3InstanceMedium: InstanceType = js.native
  val M3InstanceXLarge: InstanceType = js.native
  val M4Instance10XLarge: InstanceType = js.native
  val M4Instance16XLarge: InstanceType = js.native
  val M4Instance2XLarge: InstanceType = js.native
  val M4Instance4XLarge: InstanceType = js.native
  val M4InstanceLarge: InstanceType = js.native
  val M4InstanceXLarge: InstanceType = js.native
  val M5Instance12XLarge: InstanceType = js.native
  val M5Instance24XLarge: InstanceType = js.native
  val M5Instance2XLarge: InstanceType = js.native
  val M5Instance4XLarge: InstanceType = js.native
  val M5InstanceLarge: InstanceType = js.native
  val M5InstanceXLarge: InstanceType = js.native
  val M5aInstance12XLarge: InstanceType = js.native
  val M5aInstance24XLarge: InstanceType = js.native
  val M5aInstance2XLarge: InstanceType = js.native
  val M5aInstance4XLarge: InstanceType = js.native
  val M5aInstanceLarge: InstanceType = js.native
  val M5aInstanceXLarge: InstanceType = js.native
  val M5dInstance12XLarge: InstanceType = js.native
  val M5dInstance24XLarge: InstanceType = js.native
  val M5dInstance2XLarge: InstanceType = js.native
  val M5dInstance4XLarge: InstanceType = js.native
  val M5dInstanceLarge: InstanceType = js.native
  val M5dInstanceXLarge: InstanceType = js.native
  val P2Instance16XLarge: InstanceType = js.native
  val P2Instance8XLarge: InstanceType = js.native
  val P2InstanceXLarge: InstanceType = js.native
  val P3Instance16XLarge: InstanceType = js.native
  val P3Instance2XLarge: InstanceType = js.native
  val P3Instance8XLarge: InstanceType = js.native
  val P3dnInstance24XLarge: InstanceType = js.native
  val R3Instance2XLarge: InstanceType = js.native
  val R3Instance4XLarge: InstanceType = js.native
  val R3Instance8XLarge: InstanceType = js.native
  val R3InstanceLarge: InstanceType = js.native
  val R3InstanceXLarge: InstanceType = js.native
  val R4Instance16XLarge: InstanceType = js.native
  val R4Instance2XLarge: InstanceType = js.native
  val R4Instance4XLarge: InstanceType = js.native
  val R4Instance8XLarge: InstanceType = js.native
  val R4InstanceLarge: InstanceType = js.native
  val R4InstanceXLarge: InstanceType = js.native
  val R5Instance12XLarge: InstanceType = js.native
  val R5Instance24XLarge: InstanceType = js.native
  val R5Instance2XLarge: InstanceType = js.native
  val R5Instance4XLarge: InstanceType = js.native
  val R5InstanceLarge: InstanceType = js.native
  val R5InstanceXLarge: InstanceType = js.native
  val R5aInstance12XLarge: InstanceType = js.native
  val R5aInstance24XLarge: InstanceType = js.native
  val R5aInstance2XLarge: InstanceType = js.native
  val R5aInstance4XLarge: InstanceType = js.native
  val R5aInstanceLarge: InstanceType = js.native
  val R5aInstanceXLarge: InstanceType = js.native
  val R5dInstance12XLarge: InstanceType = js.native
  val R5dInstance24XLarge: InstanceType = js.native
  val R5dInstance2XLarge: InstanceType = js.native
  val R5dInstance4XLarge: InstanceType = js.native
  val R5dInstanceLarge: InstanceType = js.native
  val R5dInstanceXLarge: InstanceType = js.native
  val T2Instance2XLarge: InstanceType = js.native
  val T2InstanceLarge: InstanceType = js.native
  val T2InstanceMedium: InstanceType = js.native
  val T2InstanceMicro: InstanceType = js.native
  val T2InstanceNano: InstanceType = js.native
  val T2InstanceSmall: InstanceType = js.native
  val T2InstanceXLarge: InstanceType = js.native
  val T3Instance2XLarge: InstanceType = js.native
  val T3InstanceLarge: InstanceType = js.native
  val T3InstanceMedium: InstanceType = js.native
  val T3InstanceMicro: InstanceType = js.native
  val T3InstanceNano: InstanceType = js.native
  val T3InstanceSmall: InstanceType = js.native
  val T3InstanceXLarge: InstanceType = js.native
  val UInstance12tb1Metal: InstanceType = js.native
  val UInstance6tb1Metal: InstanceType = js.native
  val UInstance9tb1Metal: InstanceType = js.native
  val X1Instance16XLarge: InstanceType = js.native
  val X1Instance32XLarge: InstanceType = js.native
  val X1eInstance16XLarge: InstanceType = js.native
  val X1eInstance2XLarge: InstanceType = js.native
  val X1eInstance32XLarge: InstanceType = js.native
  val X1eInstance4XLarge: InstanceType = js.native
  val X1eInstance8XLarge: InstanceType = js.native
  val X1eInstanceXLarge: InstanceType = js.native
  val Z1dInstance12XLarge: InstanceType = js.native
  val Z1dInstance2XLarge: InstanceType = js.native
  val Z1dInstance3XLarge: InstanceType = js.native
  val Z1dInstance6XLarge: InstanceType = js.native
  val Z1dInstanceLarge: InstanceType = js.native
  val Z1dInstanceXLarge: InstanceType = js.native
  @js.native
  object InstanceTypes extends js.Object {
    val A1_2XLarge: InstanceType = js.native
    val A1_4XLarge: InstanceType = js.native
    val A1_Large: InstanceType = js.native
    val A1_Medium: InstanceType = js.native
    val A1_XLarge: InstanceType = js.native
    val C3_2XLarge: InstanceType = js.native
    val C3_4XLarge: InstanceType = js.native
    val C3_8XLarge: InstanceType = js.native
    val C3_Large: InstanceType = js.native
    val C3_XLarge: InstanceType = js.native
    val C4_2XLarge: InstanceType = js.native
    val C4_4XLarge: InstanceType = js.native
    val C4_8XLarge: InstanceType = js.native
    val C4_Large: InstanceType = js.native
    val C4_XLarge: InstanceType = js.native
    val C5_18XLarge: InstanceType = js.native
    val C5_2XLarge: InstanceType = js.native
    val C5_4XLarge: InstanceType = js.native
    val C5_9XLarge: InstanceType = js.native
    val C5_Large: InstanceType = js.native
    val C5_XLarge: InstanceType = js.native
    val C5d_18XLarge: InstanceType = js.native
    val C5d_2XLarge: InstanceType = js.native
    val C5d_4XLarge: InstanceType = js.native
    val C5d_9XLarge: InstanceType = js.native
    val C5d_Large: InstanceType = js.native
    val C5d_XLarge: InstanceType = js.native
    val C5n_18XLarge: InstanceType = js.native
    val C5n_2XLarge: InstanceType = js.native
    val C5n_4XLarge: InstanceType = js.native
    val C5n_9XLarge: InstanceType = js.native
    val C5n_Large: InstanceType = js.native
    val C5n_XLarge: InstanceType = js.native
    val D2_2XLarge: InstanceType = js.native
    val D2_4XLarge: InstanceType = js.native
    val D2_8XLarge: InstanceType = js.native
    val D2_XLarge: InstanceType = js.native
    val F1_16XLarge: InstanceType = js.native
    val F1_2XLarge: InstanceType = js.native
    val G2_2XLarge: InstanceType = js.native
    val G2_8XLarge: InstanceType = js.native
    val G3_16XLarge: InstanceType = js.native
    val G3_4XLarge: InstanceType = js.native
    val G3_8XLarge: InstanceType = js.native
    val G3s_XLarge: InstanceType = js.native
    val H1_16XLarge: InstanceType = js.native
    val H1_2XLarge: InstanceType = js.native
    val H1_4XLarge: InstanceType = js.native
    val H1_8XLarge: InstanceType = js.native
    val Hs1_8XLarge: InstanceType = js.native
    val I3_16XLarge: InstanceType = js.native
    val I3_2XLarge: InstanceType = js.native
    val I3_4XLarge: InstanceType = js.native
    val I3_8XLarge: InstanceType = js.native
    val I3_Large: InstanceType = js.native
    val I3_Metal: InstanceType = js.native
    val I3_XLarge: InstanceType = js.native
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
    val M5a_12XLarge: InstanceType = js.native
    val M5a_24XLarge: InstanceType = js.native
    val M5a_2XLarge: InstanceType = js.native
    val M5a_4XLarge: InstanceType = js.native
    val M5a_Large: InstanceType = js.native
    val M5a_XLarge: InstanceType = js.native
    val M5d_12XLarge: InstanceType = js.native
    val M5d_24XLarge: InstanceType = js.native
    val M5d_2XLarge: InstanceType = js.native
    val M5d_4XLarge: InstanceType = js.native
    val M5d_Large: InstanceType = js.native
    val M5d_XLarge: InstanceType = js.native
    val P2_16XLarge: InstanceType = js.native
    val P2_8XLarge: InstanceType = js.native
    val P2_XLarge: InstanceType = js.native
    val P3_16XLarge: InstanceType = js.native
    val P3_2XLarge: InstanceType = js.native
    val P3_8XLarge: InstanceType = js.native
    val P3dn_24XLarge: InstanceType = js.native
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
    val R5a_12XLarge: InstanceType = js.native
    val R5a_24XLarge: InstanceType = js.native
    val R5a_2XLarge: InstanceType = js.native
    val R5a_4XLarge: InstanceType = js.native
    val R5a_Large: InstanceType = js.native
    val R5a_XLarge: InstanceType = js.native
    val R5d_12XLarge: InstanceType = js.native
    val R5d_24XLarge: InstanceType = js.native
    val R5d_2XLarge: InstanceType = js.native
    val R5d_4XLarge: InstanceType = js.native
    val R5d_Large: InstanceType = js.native
    val R5d_XLarge: InstanceType = js.native
    val T2_2XLarge: InstanceType = js.native
    val T2_Large: InstanceType = js.native
    val T2_Medium: InstanceType = js.native
    val T2_Micro: InstanceType = js.native
    val T2_Nano: InstanceType = js.native
    val T2_Small: InstanceType = js.native
    val T2_XLarge: InstanceType = js.native
    val T3_2XLarge: InstanceType = js.native
    val T3_Large: InstanceType = js.native
    val T3_Medium: InstanceType = js.native
    val T3_Micro: InstanceType = js.native
    val T3_Nano: InstanceType = js.native
    val T3_Small: InstanceType = js.native
    val T3_XLarge: InstanceType = js.native
    val T3a_2XLarge: InstanceType = js.native
    val T3a_Large: InstanceType = js.native
    val T3a_Medium: InstanceType = js.native
    val T3a_Micro: InstanceType = js.native
    val T3a_Nano: InstanceType = js.native
    val T3a_Small: InstanceType = js.native
    val T3a_XLarge: InstanceType = js.native
    val U_12tb1Metal: InstanceType = js.native
    val U_6tb1Metal: InstanceType = js.native
    val U_9tb1Metal: InstanceType = js.native
    val X1_16XLarge: InstanceType = js.native
    val X1_32XLarge: InstanceType = js.native
    val X1e_16XLarge: InstanceType = js.native
    val X1e_2XLarge: InstanceType = js.native
    val X1e_32XLarge: InstanceType = js.native
    val X1e_4XLarge: InstanceType = js.native
    val X1e_8XLarge: InstanceType = js.native
    val X1e_XLarge: InstanceType = js.native
    val Z1d_12XLarge: InstanceType = js.native
    val Z1d_2XLarge: InstanceType = js.native
    val Z1d_3XLarge: InstanceType = js.native
    val Z1d_6XLarge: InstanceType = js.native
    val Z1d_Large: InstanceType = js.native
    val Z1d_XLarge: InstanceType = js.native
  }
  
}

