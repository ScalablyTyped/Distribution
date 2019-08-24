organization := "org.scalablytyped"
name := "react-bootstrap-daterangepicker"
version := "0.0-unknown-dt-20190322Z-06df0f"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-c240ab",
  "org.scalablytyped" %%% "daterangepicker" % "3.0-dt-20190212Z-82996f",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20190815Z-2b422f",
  "org.scalablytyped" %%% "moment" % "2.24.0-92164a",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-f929bc",
  "org.scalablytyped" %%% "react" % "16.9-dt-20190815Z-847c1a",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-2bc54f",
  "org.scalablytyped" %%% "std" % "3.5-cd493c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        