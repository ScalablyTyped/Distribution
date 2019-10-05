organization := "org.scalablytyped"
name := "react-bootstrap-daterangepicker"
version := "0.0-unknown-dt-20190322Z-e8d370"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-1967d7",
  "org.scalablytyped" %%% "daterangepicker" % "3.0-dt-20190212Z-96642d",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20190815Z-f791ad",
  "org.scalablytyped" %%% "moment" % "2.24.0-376d78",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-e54803",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191003Z-cca292",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-77de40",
  "org.scalablytyped" %%% "std" % "3.6-abb6d3")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        