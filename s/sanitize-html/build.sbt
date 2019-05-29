organization := "org.scalablytyped"
name := "sanitize-html"
version := "1.18.2-dt-20190326Z-00ecc9"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "domhandler" % "2.4-dt-20190326Z-f82e49",
  "org.scalablytyped" %%% "domutils" % "1.7-dt-20190326Z-c56017",
  "org.scalablytyped" %%% "htmlparser2" % "v3.10.x-dt-20190326Z-f0df3b",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190528Z-17198b",
  "org.scalablytyped" %%% "std" % "3.4-ef47bb")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        