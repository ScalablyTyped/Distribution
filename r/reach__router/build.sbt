organization := "org.scalablytyped"
name := "reach__router"
version := "1.2-dt-20190404Z-49d4c1"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped" %%% "csstype" % "2.6.6-d2dd63",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20190822Z-314bbb",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190903Z-b412db",
  "org.scalablytyped" %%% "react" % "16.9-dt-20190815Z-076e3c",
  "org.scalablytyped" %%% "std" % "3.7.0-dev-0b7356")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        